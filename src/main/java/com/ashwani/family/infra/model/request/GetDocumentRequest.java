package com.ashwani.family.infra.model.request;

import com.ashwani.family.infra.model.GenericRequest;
import com.ashwani.family.util.constants.JsonConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor@Data
@Getter@Setter
public class GetDocumentRequest extends BaseRequest implements GenericRequest {

    @JsonProperty(JsonConstants.HOLDER)
    private String memberId;
}
