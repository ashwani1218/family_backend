package com.ashwani.family.business.service.impl;

import com.ashwani.family.business.service.DocumentTypeService;
import com.ashwani.family.business.translator.DocumentTranslator;
import com.ashwani.family.infra.entity.DocumentType;
import com.ashwani.family.infra.model.request.AddDocumentTypeRequest;
import com.ashwani.family.infra.model.response.AddDocumentTypeResponse;
import com.ashwani.family.infra.model.response.GetDocumentTypesResponse;
import com.ashwani.family.infra.repository.DocumentTypeRepository;
import com.ashwani.family.util.response_builder.failed.DocumentFailedResponseBuilder;
import com.ashwani.family.util.response_builder.success.DocumentSuccessResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentTypeServiceImpl implements DocumentTypeService {

    @Autowired
    private DocumentTypeRepository documentTypeRepository;

    @Autowired
    private DocumentSuccessResponseBuilder successResponseBuilder;

    @Autowired
    private DocumentTranslator documentTranslator;

    @Autowired
    private DocumentFailedResponseBuilder failedResponseBuilder;

    @Override
    public GetDocumentTypesResponse getDocumentTypes() {
        List<DocumentType> documentTypes = documentTypeRepository.findAll();
        return successResponseBuilder.getDocumentTypes(documentTypes);
    }

    @Override
    public AddDocumentTypeResponse addDocument(AddDocumentTypeRequest request) {
        DocumentType documentType = documentTranslator.addDocumentTypeTranslator(request);
        try{
            documentTypeRepository.save(documentType);
        }catch (Exception e){
            return failedResponseBuilder.addDocumentType();
        }
        return successResponseBuilder.addDocumentType(documentType);
    }
}
