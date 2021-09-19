package com.ashwani.family.util.response_builder.success;

import com.ashwani.family.infra.model.response.AddDocumentResponse;
import com.ashwani.family.infra.model.response.BaseResponse;
import com.ashwani.family.util.constants.ResponseConstants;
import com.ashwani.family.util.response_builder.BaseSuccessResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        resp.setStatus(resp.getStatus());
        return resp;
    }
}
