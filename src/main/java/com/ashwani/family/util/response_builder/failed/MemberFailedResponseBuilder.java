package com.ashwani.family.util.response_builder.failed;

import com.ashwani.family.infra.model.response.BaseResponse;
import com.ashwani.family.infra.model.response.FindMemberResponse;
import com.ashwani.family.util.constants.ResponseConstants;
import com.ashwani.family.util.response_builder.BaseFailedResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberFailedResponseBuilder {

    @Autowired
    private BaseFailedResponseBuilder baseFailedResponseBuilder;

    public BaseResponse addMember() {
        BaseResponse resp = baseFailedResponseBuilder.baseFailResponse();
        resp.setResponseDescription(ResponseConstants.ADD_MEMBER_FAILURE);
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
