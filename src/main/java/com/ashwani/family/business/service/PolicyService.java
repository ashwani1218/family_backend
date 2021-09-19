package com.ashwani.family.business.service;

import com.ashwani.family.infra.model.request.AddPolicyRequest;
import com.ashwani.family.infra.model.request.FindAllPoliciesRequest;
import com.ashwani.family.infra.model.response.AddPolicyResponse;
import com.ashwani.family.infra.model.response.FindAllPoliciesResponse;

public interface PolicyService {

    public AddPolicyResponse addPolicy(AddPolicyRequest request);

    public FindAllPoliciesResponse getAllPolicies(FindAllPoliciesRequest request);
}
