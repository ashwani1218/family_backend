package com.ashwani.family.util.response_builder;

import com.ashwani.family.infra.model.response.BaseResponse;
import com.ashwani.family.util.constants.ResponseConstants;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class BaseFailedResponseBuilder {

    public BaseResponse baseFailResponse(){
        var response = new BaseResponse();
        response.setHttpStatus(HttpStatus.BAD_REQUEST);
        response.setResponseCode(ResponseConstants.FAILURE_CODE);
        response.setStatus(ResponseConstants.FAILED_STATUS);
       return response;
    }
}
