package com.ashwani.family.infra.model.request;

import com.ashwani.family.infra.model.GenericRequest;
import com.ashwani.family.util.constants.JsonConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Data
public class AddDocumentTypeRequest extends BaseRequest implements GenericRequest {

    @JsonProperty(JsonConstants.DOCUMENT_TYPE)
    private String type;

}
