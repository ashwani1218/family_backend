package com.ashwani.family.util.response_builder.failed;

import com.ashwani.family.infra.model.response.AddDocumentResponse;
import com.ashwani.family.infra.model.response.AddDocumentTypeResponse;
import com.ashwani.family.infra.model.response.BaseResponse;
import com.ashwani.family.util.constants.ResponseConstants;
import com.ashwani.family.util.response_builder.BaseFailedResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentFailedResponseBuilder {

    @Autowired
    private BaseFailedResponseBuilder failedResponseBuilder;


    public AddDocumentResponse addDocument() {
        BaseResponse response = failedResponseBuilder.baseFailResponse();
        var resp = new AddDocumentResponse();
        resp.setStatus(response.getStatus());
        resp.setHttpStatus(response.getHttpStatus());
        resp.setResponseCode(response.getResponseCode());
        resp.setResponseDescription(ResponseConstants.ADD_DOCUMENT_FAILURE);
        return resp;
    }

    public AddDocumentTypeResponse addDocumentType() {
        BaseResponse response = failedResponseBuilder.baseFailResponse();
        var resp = new AddDocumentTypeResponse();
        resp.setStatus(response.getStatus());
        resp.setHttpStatus(response.getHttpStatus());
        resp.setResponseCode(response.getResponseCode());
        resp.setResponseDescription(ResponseConstants.ADD_DOCUMENT_TYPE_FAILURE);
        return resp;
    }

    public BaseResponse markedAsPaid() {
        BaseResponse response = failedResponseBuilder.baseFailResponse();
        response.setResponseDescription(ResponseConstants.MARKED_AS_PAID_FAILURE);
        return response;
    }
}
