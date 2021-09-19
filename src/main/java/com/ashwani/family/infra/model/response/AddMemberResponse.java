package com.ashwani.family.infra.model.response;

import com.ashwani.family.infra.model.GenericResponse;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Builder
@Data
@Getter
@Setter
public class AddMemberResponse extends BaseResponse implements GenericResponse {
}
