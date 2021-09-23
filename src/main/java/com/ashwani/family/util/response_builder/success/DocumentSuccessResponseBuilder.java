package com.ashwani.family.util.response_builder.success;

import com.ashwani.family.infra.entity.DocumentType;
import com.ashwani.family.infra.model.response.AddDocumentResponse;
import com.ashwani.family.infra.model.response.AddDocumentTypeResponse;
import com.ashwani.family.infra.model.response.BaseResponse;
import com.ashwani.family.infra.model.response.GetDocumentTypesResponse;
import com.ashwani.family.util.constants.ResponseConstants;
import com.ashwani.family.util.response_builder.BaseSuccessResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentSuccessResponseBuilder {

    @Autowired
    private BaseSuccessResponseBuilder baseSuccessResponseBuilder;

    public AddDocumentResponse addDocument() {
        BaseResponse response = baseSuccessResponseBuilder.baseSuccessResponse();
        var resp = new AddDocumentResponse();
        resp.setHttpStatus(response.getHttpStatus());
        resp.setResponseCode(response.getResponseCode());
        resp.setResponseDescription(ResponseConstants.ADD_DOCUMENT_SUCCESS);
        resp.setStatus(response.getStatus());
        return resp;
    }

    public GetDocumentTypesResponse getDocumentTypes(List<DocumentType> documentTypes) {
        BaseResponse response = baseSuccessResponseBuilder.baseSuccessResponse();
        var resp = new GetDocumentTypesResponse();
        resp.setStatus(response.getStatus());
        resp.setHttpStatus(response.getHttpStatus());
        resp.setResponseCode(response.getResponseCode());
        resp.setResponseDescription(ResponseConstants.GET_DOC_TYPE_SUCCESS);
        resp.setDocumentTypes(documentTypes);
        return resp;
    }

    public AddDocumentTypeResponse addDocumentType() {
        BaseResponse response = baseSuccessResponseBuilder.baseSuccessResponse();
        var resp = new AddDocumentTypeResponse();
        resp.setHttpStatus(response.getHttpStatus());
        resp.setResponseCode(response.getResponseCode());
        resp.setResponseDescription(ResponseConstants.ADD_DOC_TYPE_SUCCESS);
        resp.setStatus(response.getStatus());
        return resp;
    }
}
