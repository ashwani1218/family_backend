package com.ashwani.family.infra.model.response;

import com.ashwani.family.infra.entity.FamilyMember;
import com.ashwani.family.infra.model.GenericResponse;
import com.ashwani.family.util.constants.JsonConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindAllMembersResponse extends BaseResponse implements GenericResponse {

    @JsonProperty(JsonConstants.MEMBERS)
    private List<FamilyMember> members;
}
