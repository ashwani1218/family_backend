package com.ashwani.family.business.service;

import com.ashwani.family.infra.model.request.AddDocumentTypeRequest;
import com.ashwani.family.infra.model.response.AddDocumentTypeResponse;
import com.ashwani.family.infra.model.response.GetDocumentTypesResponse;

public interface DocumentTypeService {

   public GetDocumentTypesResponse getDocumentTypes();


   public AddDocumentTypeResponse addDocument(AddDocumentTypeRequest request);
}
