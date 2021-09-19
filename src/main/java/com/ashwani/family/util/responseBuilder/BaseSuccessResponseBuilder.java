package com.ashwani.family.util.responseBuilder;

import com.ashwani.family.infra.model.response.BaseResponse;
import com.ashwani.family.util.constants.ResponseConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class BaseSuccessResponseBuilder {

    @Autowired
    private ResponseConstants responseConstants;

    public BaseResponse baseSuccessResponse(){
        BaseResponse response = new BaseResponse();
        response.setHttpStatus(HttpStatus.OK);
        response.setResponseCode(responseConstants.SUCCESS_CODE);
        response.setStatus(responseConstants.SUCCESS_STATUS);
        return response;
    }
}
