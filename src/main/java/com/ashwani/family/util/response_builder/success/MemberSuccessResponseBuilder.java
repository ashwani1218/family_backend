package com.ashwani.family.util.response_builder.success;

import com.ashwani.family.infra.entity.FamilyMember;
import com.ashwani.family.infra.model.response.BaseResponse;
import com.ashwani.family.infra.model.response.FindAllMembersResponse;
import com.ashwani.family.infra.model.response.FindMemberResponse;
import com.ashwani.family.util.constants.ResponseConstants;
import com.ashwani.family.util.response_builder.BaseSuccessResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberSuccessResponseBuilder extends BaseSuccessResponseBuilder {

    @Autowired
    private BaseSuccessResponseBuilder baseSuccessResponseBuilder;

    public BaseResponse addMember() {
        BaseResponse resp = baseSuccessResponseBuilder.baseSuccessResponse();
        resp.setResponseDescription(ResponseConstants.ADD_MEMBER_SUCCESS);
        return resp;
    }

    public FindAllMembersResponse findAllMembers(List<FamilyMember> familyMembers){
        BaseResponse response = baseSuccessResponseBuilder.baseSuccessResponse();
        var resp = new FindAllMembersResponse();
        resp.setHttpStatus(response.getHttpStatus());
        resp.setResponseCode(response.getResponseCode());
        resp.setResponseDescription(ResponseConstants.SUCCESS_CODE);
        resp.setMembers(familyMembers);
        return resp;
    }

    public FindMemberResponse findMember(FamilyMember familyMember) {
        BaseResponse response = baseSuccessResponseBuilder.baseSuccessResponse();
        var resp = new FindMemberResponse();
        resp.setHttpStatus(response.getHttpStatus());
        resp.setResponseCode(response.getResponseCode());
        resp.setResponseDescription(ResponseConstants.SUCCESS_CODE);
        resp.setFamilyMember(familyMember);
        return resp;
    }
}
