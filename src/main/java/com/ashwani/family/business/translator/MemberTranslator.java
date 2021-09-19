package com.ashwani.family.business.translator;

import com.ashwani.family.infra.entity.FamilyMember;
import com.ashwani.family.infra.model.request.AddMemberRequest;
import org.springframework.stereotype.Component;

@Component
public class MemberTranslator {

    public FamilyMember addMemberTranslator(AddMemberRequest request) {
        return FamilyMember.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .build();
    }
}
