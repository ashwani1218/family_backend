package com.ashwani.family.business.controller;

import com.ashwani.family.business.service.MemberService;
import com.ashwani.family.infra.model.request.AddMemberRequest;
import com.ashwani.family.infra.model.response.AddMemberResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@Slf4j
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping("/addMember")
    public AddMemberResponse addMember(@RequestBody AddMemberRequest request){
        log.info("Add Family member request [{}]", request);
        return memberService.addMember(request);
    }
}
