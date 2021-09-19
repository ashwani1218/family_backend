package com.ashwani.family.util.responseBuilder.success;

import com.ashwani.family.infra.model.response.AddPolicyResponse;
import com.ashwani.family.infra.model.response.BaseResponse;
import com.ashwani.family.util.constants.ResponseConstants;
import com.ashwani.family.util.responseBuilder.BaseSuccessResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicySuccessResponseBuilder {

    @Autowired
    private BaseSuccessResponseBuilder baseSuccessResponseBuilder;

    @Autowired
    private ResponseConstants responseConstants;

    public AddPolicyResponse addPolicy() {
        BaseResponse response = baseSuccessResponseBuilder.baseSuccessResponse();
        var resp = new AddPolicyResponse();
        resp.setHttpStatus(response.getHttpStatus());
        resp.setResponseCode(response.getResponseCode());
        resp.setResponseDescription(responseConstants.ADD_POLICY_SUCCESS);
        return resp;
    }
}
