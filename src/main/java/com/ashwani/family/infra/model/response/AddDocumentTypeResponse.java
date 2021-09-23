package com.ashwani.family.infra.model.response;

import com.ashwani.family.infra.model.GenericResponse;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor
@Getter
@Setter
public class AddDocumentTypeResponse extends BaseResponse implements GenericResponse {
}
