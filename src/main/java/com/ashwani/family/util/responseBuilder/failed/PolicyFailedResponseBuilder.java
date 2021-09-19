package com.ashwani.family.util.responseBuilder.failed;

import com.ashwani.family.infra.model.response.AddPolicyResponse;
import com.ashwani.family.util.constants.ResponseConstants;
import com.ashwani.family.util.responseBuilder.BaseFailedResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyFailedResponseBuilder {

    @Autowired
    private BaseFailedResponseBuilder failedResponseBuilder;

    @Autowired
    private ResponseConstants responseConstants;

    public AddPolicyResponse addPolicy() {
        AddPolicyResponse resp = (AddPolicyResponse)failedResponseBuilder.baseFailResponse();
        resp.setResponseDescription(responseConstants.ADD_POLICY_FAILURE);
        return resp;
    }
}
