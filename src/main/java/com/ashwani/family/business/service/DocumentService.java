package com.ashwani.family.business.service;

import com.ashwani.family.infra.entity.MemberDocument;
import com.ashwani.family.infra.model.request.AddDocumentRequest;
import com.ashwani.family.infra.model.request.FindAllDocumentRequest;
import com.ashwani.family.infra.model.response.AddDocumentResponse;
import com.ashwani.family.infra.model.response.FindAllDocumentResponse;
import com.ashwani.family.infra.model.response.GetDocumentResponse;

public interface DocumentService {

    public AddDocumentResponse addDocument(AddDocumentRequest request);

    public GetDocumentResponse getAllDocuments();

    MemberDocument findById(String documentId);
}
