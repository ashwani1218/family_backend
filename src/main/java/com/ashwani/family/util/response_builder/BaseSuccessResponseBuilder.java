package com.ashwani.family.util.response_builder;

import com.ashwani.family.infra.model.response.BaseResponse;
import com.ashwani.family.util.constants.ResponseConstants;
import lombok.*;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class BaseSuccessResponseBuilder {

    public BaseResponse baseSuccessResponse(){
        var response = new BaseResponse();
        response.setHttpStatus(HttpStatus.OK);
        response.setResponseCode(ResponseConstants.SUCCESS_CODE);
        response.setStatus(ResponseConstants.SUCCESS_STATUS);
        return response;
    }
}
