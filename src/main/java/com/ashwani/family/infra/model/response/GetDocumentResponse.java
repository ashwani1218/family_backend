package com.ashwani.family.infra.model.response;

import com.ashwani.family.infra.entity.MemberDocument;
import com.ashwani.family.infra.model.GenericResponse;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetDocumentResponse extends BaseResponse implements GenericResponse {

    private List<MemberDocument> memberPolicies;
}
