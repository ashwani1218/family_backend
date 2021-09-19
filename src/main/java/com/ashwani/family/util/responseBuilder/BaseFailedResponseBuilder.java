package com.ashwani.family.util.responseBuilder;

import com.ashwani.family.infra.model.response.BaseResponse;
import com.ashwani.family.util.constants.ResponseConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class BaseFailedResponseBuilder {

    @Autowired
    private ResponseConstants responseConstants;

    public BaseResponse baseFailResponse(){
        BaseResponse response = new BaseResponse();
        response.setHttpStatus(HttpStatus.BAD_REQUEST);
        response.setResponseCode(responseConstants.FAILURE_CODE);
        response.setStatus(responseConstants.FAILED_STATUS);
       return response;
    }
}
