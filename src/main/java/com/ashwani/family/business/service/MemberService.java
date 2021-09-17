package com.ashwani.family.business.service;

import com.ashwani.family.infra.model.request.AddMemberRequest;
import com.ashwani.family.infra.model.response.AddMemberResponse;
import com.ashwani.family.infra.model.response.FindAllMembersResponse;
import com.ashwani.family.infra.model.response.FindMemberResponse;

public interface MemberService {

    public AddMemberResponse addMember(AddMemberRequest request);

    public FindAllMembersResponse findAllMembers();

    public FindMemberResponse findMemberById(Long id);
}
