package com.ashwani.family.business.service.impl;

import com.ashwani.family.business.service.PolicyService;
import com.ashwani.family.business.translator.PolicyTranslator;
import com.ashwani.family.infra.entity.Policy;
import com.ashwani.family.infra.model.request.AddPolicyRequest;
import com.ashwani.family.infra.model.request.FindAllPoliciesRequest;
import com.ashwani.family.infra.model.response.AddPolicyResponse;
import com.ashwani.family.infra.model.response.FindAllPoliciesResponse;
import com.ashwani.family.infra.repository.PolicyRepository;
import com.ashwani.family.util.responseBuilder.failed.PolicyFailedResponseBuilder;
import com.ashwani.family.util.responseBuilder.success.PolicySuccessResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyServiceImpl implements PolicyService {

    @Autowired
    private PolicyTranslator policyTranslator;

    @Autowired
    private PolicyRepository policyRepository;

    @Autowired
    private PolicyFailedResponseBuilder failedResponseBuilder;

    @Autowired
    private PolicySuccessResponseBuilder successResponseBuilder;

    @Override
    public AddPolicyResponse addPolicy(AddPolicyRequest request) {
        Policy policy = policyTranslator.addPolicyTranslator(request);
        try{
            policyRepository.save(policy);
        }catch (Exception e){
            return failedResponseBuilder.addPolicy();
        }
        return successResponseBuilder.addPolicy();
    }

    @Override
    public FindAllPoliciesResponse getAllPolicies(FindAllPoliciesRequest request) {
        return null;
    }
}
