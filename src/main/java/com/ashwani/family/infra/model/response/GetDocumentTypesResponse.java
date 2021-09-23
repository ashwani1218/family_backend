package com.ashwani.family.infra.model.response;

import com.ashwani.family.infra.entity.DocumentType;
import com.ashwani.family.infra.model.GenericResponse;
import com.ashwani.family.util.constants.JsonConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetDocumentTypesResponse extends BaseResponse implements GenericResponse {

    @JsonProperty(JsonConstants.DOCUMENT_TYPES)
    private List<DocumentType> documentTypes;
}
