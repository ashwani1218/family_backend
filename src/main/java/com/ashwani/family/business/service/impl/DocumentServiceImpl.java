package com.ashwani.family.business.service.impl;

import com.ashwani.family.business.service.DocumentService;
import com.ashwani.family.business.translator.DocumentTranslator;
import com.ashwani.family.infra.entity.MemberDocument;
import com.ashwani.family.infra.model.request.AddDocumentRequest;
import com.ashwani.family.infra.model.response.AddDocumentResponse;
import com.ashwani.family.infra.model.response.BaseResponse;
import com.ashwani.family.infra.model.response.GetDocumentResponse;
import com.ashwani.family.infra.repository.MemberDocumentRepository;
import com.ashwani.family.util.response_builder.failed.DocumentFailedResponseBuilder;
import com.ashwani.family.util.response_builder.success.DocumentSuccessResponseBuilder;
import com.ashwani.family.util.response_builder.success.MemberSuccessResponseBuilder;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DocumentServiceImpl implements DocumentService {

    @Autowired
    private DocumentTranslator documentTranslator;

    @Autowired
    private MemberDocumentRepository documentRepository;

    @Autowired
    private DocumentFailedResponseBuilder failedResponseBuilder;

    @Autowired
    private DocumentSuccessResponseBuilder successResponseBuilder;

    @Autowired
    private MemberSuccessResponseBuilder memberSuccessResponseBuilder;

    @Autowired
    private CacheManager cacheManager;

    @Override
    public AddDocumentResponse addDocument(AddDocumentRequest request) {
        MemberDocument document = documentTranslator.addDocumentTranslator(request);
        try{
            documentRepository.save(document);
        }catch (Exception e){
            return failedResponseBuilder.addDocument();
        }
        return successResponseBuilder.addDocument(document);
    }

    @Override
    public GetDocumentResponse getAllDocuments() {
        List<MemberDocument> documents = documentRepository.findAll();
        return memberSuccessResponseBuilder.getDocuments(documents);
    }

    @Override
    public MemberDocument findById(String documentId) {
        Optional<MemberDocument> document = documentRepository.findById(documentId);
        return document.orElse(null);
    }

    @Override
    public BaseResponse markAsPaid(String id) {
        Optional<MemberDocument> document = documentRepository.findById(id);
        if(document.isPresent()){
            var doc = document.get();
            if (Objects.nonNull(doc.getPremiumDate())) {
                doc.setPremiumDate(DateUtils.addYears(doc.getPremiumDate(), 1));
                documentRepository.save(doc);
                for(String name:cacheManager.getCacheNames()){
                    Objects.requireNonNull(cacheManager.getCache(name)).clear();         // clear cache by name
                }
                return successResponseBuilder.markedAsPaid(doc);
            }
            else{
                return failedResponseBuilder.markedAsPaid();
            }
        }
        else{
            return failedResponseBuilder.markedAsPaid();
        }
    }
}
