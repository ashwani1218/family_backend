package com.ashwani.family.util.responseBuilder.succes;

import com.ashwani.family.infra.entity.FamilyMember;
import com.ashwani.family.infra.model.response.AddMemberResponse;
import com.ashwani.family.infra.model.response.FindAllMembersResponse;
import com.ashwani.family.infra.model.response.FindMemberResponse;
import com.ashwani.family.util.constants.ResponseConstants;
import com.ashwani.family.util.responseBuilder.BaseSuccessResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MemberSuccessResponseBuilder extends BaseSuccessResponseBuilder {

    @Autowired
    private ResponseConstants responseConstants;

    @Autowired
    private BaseSuccessResponseBuilder baseSuccessResponseBuilder;


    public AddMemberResponse addMember() {
        AddMemberResponse resp = (AddMemberResponse)baseSuccessResponseBuilder.baseSuccessResponse();
        resp.setResponseDescription(responseConstants.ADD_MEMBER_SUCCESS);
        return resp;
    }

    public FindAllMembersResponse findAllMembers(List<FamilyMember> familyMembers){
        FindAllMembersResponse resp = (FindAllMembersResponse)baseSuccessResponseBuilder.baseSuccessResponse();
        resp.setMembers(familyMembers);
        return resp;
    }

    public FindMemberResponse findMember(FamilyMember familyMember) {
        FindMemberResponse resp = (FindMemberResponse)baseSuccessResponseBuilder.baseSuccessResponse();
        resp.setFamilyMember(familyMember);
        return resp;
    }
}
