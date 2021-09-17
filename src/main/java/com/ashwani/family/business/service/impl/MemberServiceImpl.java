package com.ashwani.family.business.service.impl;

import com.ashwani.family.business.service.MemberService;
import com.ashwani.family.infra.entity.FamilyMember;
import com.ashwani.family.infra.model.request.AddMemberRequest;
import com.ashwani.family.infra.model.response.AddMemberResponse;
import com.ashwani.family.infra.model.response.FindAllMembersResponse;
import com.ashwani.family.infra.model.response.FindMemberResponse;
import com.ashwani.family.infra.repository.FamilyMemberRepository;
import com.ashwani.family.util.responseBuilder.failed.MemberFailedResponseBuilder;
import com.ashwani.family.util.responseBuilder.succes.MemberSuccessResponseBuilder;
import com.ashwani.family.util.translator.MemberTranslator;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberTranslator memberTranslator;

    @Autowired
    private MemberFailedResponseBuilder failedResponseBuilder;

    @Autowired
    private MemberSuccessResponseBuilder successResponseBuilder;

    @Autowired
    private FamilyMemberRepository memberRepository;

    @Override
    public AddMemberResponse addMember(AddMemberRequest request) {
        FamilyMember member = memberTranslator.addMemberTranslator(request);
        try{
            memberRepository.save(member);
        }
        catch (Exception ex){
            return failedResponseBuilder.addMember();
        }
        return successResponseBuilder.addMember();
    }

    @Override
    public FindAllMembersResponse findAllMembers() {
        List<FamilyMember> members = memberRepository.findAll();
        return successResponseBuilder.findAllMembers(members);
    }

    @Override
    public FindMemberResponse findMemberById(Long id) {
        Optional<FamilyMember> familyMemberOptional = memberRepository.findById(id);
        if(familyMemberOptional.isPresent()){
            return successResponseBuilder.findMember(familyMemberOptional.get());
        }
        else{
            return failedResponseBuilder.findMember();
        }
    }


}
