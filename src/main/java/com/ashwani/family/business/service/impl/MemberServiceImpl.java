package com.ashwani.family.business.service.impl;

import com.ashwani.family.business.service.MemberService;
import com.ashwani.family.infra.entity.FamilyMember;
import com.ashwani.family.infra.entity.MemberDocument;
import com.ashwani.family.infra.model.request.AddMemberRequest;
import com.ashwani.family.infra.model.request.GetDocumentRequest;
import com.ashwani.family.infra.model.response.BaseResponse;
import com.ashwani.family.infra.model.response.FindAllMembersResponse;
import com.ashwani.family.infra.model.response.FindMemberResponse;
import com.ashwani.family.infra.model.response.GetDocumentResponse;
import com.ashwani.family.infra.repository.FamilyMemberRepository;
import com.ashwani.family.infra.repository.MemberDocumentRepository;
import com.ashwani.family.util.response_builder.failed.MemberFailedResponseBuilder;
import com.ashwani.family.util.response_builder.success.MemberSuccessResponseBuilder;
import com.ashwani.family.business.translator.MemberTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberTranslator memberTranslator;

    @Autowired
    private MemberFailedResponseBuilder failedResponseBuilder;

    @Autowired
    private MemberSuccessResponseBuilder successResponseBuilder;

    @Autowired
    private FamilyMemberRepository memberRepository;

    @Autowired
    private MemberDocumentRepository documentRepository;

    @Override
    public BaseResponse addMember(AddMemberRequest request) {
        FamilyMember member = memberTranslator.addMemberTranslator(request);
        try{
            memberRepository.save(member);
        }
        catch (Exception ex){
            return failedResponseBuilder.addMember();
        }
        return successResponseBuilder.addMember(member);
    }

    @Override
    public FindAllMembersResponse findAllMembers() {
        List<FamilyMember> members = memberRepository.findAll();
        return successResponseBuilder.findAllMembers(members);
    }

    @Override
    public FindMemberResponse findMemberById(String id) {
        Optional<FamilyMember> familyMemberOptional = memberRepository.findById(id);
        if(familyMemberOptional.isPresent()){
            return successResponseBuilder.findMember(familyMemberOptional.get());
        }
        else{
            return failedResponseBuilder.findMember();
        }
    }

    @Override
    public GetDocumentResponse getDocuments(GetDocumentRequest getDocumentRequest) {
        Optional<FamilyMember> familyMemberOptional = memberRepository.findById(getDocumentRequest.getMemberId());
        if(familyMemberOptional.isPresent()){
            List<MemberDocument> memberDocuments = documentRepository.findAllByHolder(familyMemberOptional.get());
            return successResponseBuilder.getDocuments(memberDocuments);
        } else {
            return failedResponseBuilder.getDocuments();
        }

    }


}
