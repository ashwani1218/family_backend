package com.ashwani.family.business.service.impl;

import com.ashwani.family.business.service.DocumentService;
import com.ashwani.family.business.translator.DocumentTranslator;
import com.ashwani.family.infra.entity.MemberDocument;
import com.ashwani.family.infra.model.request.AddDocumentRequest;
import com.ashwani.family.infra.model.request.FindAllDocumentRequest;
import com.ashwani.family.infra.model.response.AddDocumentResponse;
import com.ashwani.family.infra.model.response.FindAllDocumentResponse;
import com.ashwani.family.infra.model.response.GetDocumentResponse;
import com.ashwani.family.infra.repository.MemberDocumentRepository;
import com.ashwani.family.util.response_builder.failed.DocumentFailedResponseBuilder;
import com.ashwani.family.util.response_builder.success.DocumentSuccessResponseBuilder;
import com.ashwani.family.util.response_builder.success.MemberSuccessResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocumentServiceImpl implements DocumentService {

    @Autowired
    private DocumentTranslator documentTranslator;

    @Autowired
    private MemberDocumentRepository memberDocumentRepository;

    @Autowired
    private DocumentFailedResponseBuilder failedResponseBuilder;

    @Autowired
    private DocumentSuccessResponseBuilder successResponseBuilder;

    @Autowired
    private MemberSuccessResponseBuilder memberSuccessResponseBuilder;

    @Override
    public AddDocumentResponse addDocument(AddDocumentRequest request) {
        MemberDocument document = documentTranslator.addDocumentTranslator(request);
        try{
            memberDocumentRepository.save(document);
        }catch (Exception e){
            return failedResponseBuilder.addDocument();
        }
        return successResponseBuilder.addDocument(document);
    }

    @Override
    public GetDocumentResponse getAllDocuments() {
        List<MemberDocument> documents = memberDocumentRepository.findAll();
        return memberSuccessResponseBuilder.getDocuments(documents);
    }

    @Override
    public MemberDocument findById(String documentId) {
        Optional<MemberDocument> document = memberDocumentRepository.findById(documentId);
        return document.orElse(null);
    }
}
