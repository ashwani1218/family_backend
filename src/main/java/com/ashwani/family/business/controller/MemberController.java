package com.ashwani.family.business.controller;

import com.ashwani.family.business.service.MemberService;
import com.ashwani.family.infra.model.request.AddMemberRequest;
import com.ashwani.family.infra.model.request.GetDocumentRequest;
import com.ashwani.family.infra.model.response.BaseResponse;
import com.ashwani.family.infra.model.response.FindAllMembersResponse;
import com.ashwani.family.infra.model.response.FindMemberResponse;
import com.ashwani.family.infra.model.response.GetDocumentResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@CrossOrigin("*")
@Slf4j
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping("/addMember")
    public BaseResponse addMember(@RequestBody AddMemberRequest request){

        log.info("Add Family member request [{}]", request);
        return memberService.addMember(request);
    }

    @GetMapping("/members")
    @Cacheable(value = "members")
    public FindAllMembersResponse findAllMembers(){
        log.info("Find All family members request");
        return memberService.findAllMembers();
    }

    @GetMapping("/member/{id}")
    @Cacheable(value = "members", key = "#id")
    public FindMemberResponse findMember(@PathVariable String id){
        log.info("Find Family member with id [{}]",id);
        return memberService.findMemberById(id);
    }

    @PostMapping("/getDocuments")
    @Cacheable(value = "documents", key = "#getDocumentRequest.memberId")
    public GetDocumentResponse getDocuments(@RequestBody GetDocumentRequest getDocumentRequest){
        log.info("Get Member Documents request [{}]", getDocumentRequest);
        return memberService.getDocuments(getDocumentRequest);
    }
}
