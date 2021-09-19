package com.ashwani.family.business.service;

import com.ashwani.family.infra.model.request.AddDocumentRequest;
import com.ashwani.family.infra.model.request.FindAllDocumentRequest;
import com.ashwani.family.infra.model.response.AddDocumentResponse;
import com.ashwani.family.infra.model.response.FindAllDocumentResponse;

public interface DocumentService {

    public AddDocumentResponse addDocument(AddDocumentRequest request);

    public FindAllDocumentResponse getAllDocuments(FindAllDocumentRequest request);
}
