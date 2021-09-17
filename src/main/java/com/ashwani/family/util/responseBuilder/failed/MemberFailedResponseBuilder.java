package com.ashwani.family.util.responseBuilder.failed;

import com.ashwani.family.infra.model.response.AddMemberResponse;
import com.ashwani.family.infra.model.response.FindMemberResponse;
import com.ashwani.family.util.constants.ResponseConstants;
import com.ashwani.family.util.responseBuilder.BaseFailedResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberFailedResponseBuilder {

    @Autowired
    private ResponseConstants responseConstants;

    @Autowired
    private BaseFailedResponseBuilder baseFailedResponseBuilder;

    public AddMemberResponse addMember() {
        AddMemberResponse resp = (AddMemberResponse) baseFailedResponseBuilder.baseFailResponse();
        resp.setResponseDescription(responseConstants.ADD_MEMBER_FAILURE);
        return resp;
    }

    public FindMemberResponse findMember() {
       return (FindMemberResponse) baseFailedResponseBuilder.baseFailResponse();
    }
}
