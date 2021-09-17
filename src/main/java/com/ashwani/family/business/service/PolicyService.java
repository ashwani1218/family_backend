package com.ashwani.family.business.service;

import com.ashwani.family.infra.model.request.AddPolicyRequest;
import com.ashwani.family.infra.model.response.AddPolicyResponse;

public interface PolicyService {

    public AddPolicyResponse addPolicy(AddPolicyRequest request);
}
