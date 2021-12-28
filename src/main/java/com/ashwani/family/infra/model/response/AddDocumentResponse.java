package com.ashwani.family.infra.model.response;

import com.ashwani.family.infra.model.GenericResponse;
import com.ashwani.family.util.constants.JsonConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AddDocumentResponse extends BaseResponse implements GenericResponse {

    @JsonProperty(JsonConstants.DOCUMENT_ID)
    private String documentId;
}
