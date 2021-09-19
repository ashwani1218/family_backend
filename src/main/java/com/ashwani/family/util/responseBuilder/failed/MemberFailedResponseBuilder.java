package com.ashwani.family.util.responseBuilder.failed;

import com.ashwani.family.infra.model.response.BaseResponse;
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

    public BaseResponse addMember() {
        BaseResponse resp = baseFailedResponseBuilder.baseFailResponse();
        resp.setResponseDescription(responseConstants.ADD_MEMBER_FAILURE);
        return resp;
    }

    public FindMemberResponse findMember() {
      BaseResponse response =  baseFailedResponseBuilder.baseFailResponse();
      var resp = new FindMemberResponse();
      resp.setHttpStatus(response.getHttpStatus());
      resp.setResponseCode(response.getResponseCode());
      resp.setResponseDescription(response.getResponseDescription());
      return resp;
    }
}
