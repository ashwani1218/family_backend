package com.ashwani.family.business.service.impl;

import com.ashwani.family.business.service.DocumentService;
import com.ashwani.family.business.translator.DocumentTranslator;
import com.ashwani.family.infra.entity.MemberDocument;
import com.ashwani.family.infra.model.request.AddDocumentRequest;
import com.ashwani.family.infra.model.request.FindAllDocumentRequest;
import com.ashwani.family.infra.model.response.AddDocumentResponse;
import com.ashwani.family.infra.model.response.FindAllDocumentResponse;
import com.ashwani.family.infra.repository.MemberDocumentRepository;
import com.ashwani.family.util.response_builder.failed.DocumentFailedResponseBuilder;
import com.ashwani.family.util.response_builder.success.DocumentSuccessResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public AddDocumentResponse addDocument(AddDocumentRequest request) {
        MemberDocument document = documentTranslator.addDocumentTranslator(request);
        try{
            memberDocumentRepository.save(document);
        }catch (Exception e){
            return failedResponseBuilder.addDocument();
        }
        return successResponseBuilder.addDocument();
    }

    @Override
    public FindAllDocumentResponse getAllDocuments(FindAllDocumentRequest request) {
        return null;
    }
}