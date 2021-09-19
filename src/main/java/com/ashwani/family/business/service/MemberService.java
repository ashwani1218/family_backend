package com.ashwani.family.business.service;

import com.ashwani.family.infra.model.request.AddMemberRequest;
import com.ashwani.family.infra.model.request.GetDocumentRequest;
import com.ashwani.family.infra.model.response.*;

public interface MemberService {

    public BaseResponse addMember(AddMemberRequest request);

    public FindAllMembersResponse findAllMembers();

    public FindMemberResponse findMemberById(String id);

    GetDocumentResponse getDocuments(GetDocumentRequest getDocumentRequest);
}
