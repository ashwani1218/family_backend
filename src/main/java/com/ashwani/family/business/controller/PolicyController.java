package com.ashwani.family.business.controller;

import com.ashwani.family.business.service.PolicyService;
import com.ashwani.family.infra.model.request.AddPolicyRequest;
import com.ashwani.family.infra.model.response.AddPolicyResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@Slf4j
public class PolicyController {

    @Autowired
    private PolicyService policyService;

    @PostMapping("/addPolicy")
    public AddPolicyResponse addPolicy(@RequestBody AddPolicyRequest request){
        log.info("Add Policy Request [{}]", request);
        return policyService.addPolicy(request);
    }

}
