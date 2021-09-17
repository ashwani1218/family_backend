package com.ashwani.family.infra.model.response;

import com.ashwani.family.infra.entity.FamilyMember;
import com.ashwani.family.infra.model.GenericResponse;
import lombok.*;

@Builder
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FindMemberResponse extends BaseResponse implements GenericResponse {

    public FamilyMember familyMember;
}
