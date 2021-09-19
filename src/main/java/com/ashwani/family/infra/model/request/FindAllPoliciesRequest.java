package com.ashwani.family.infra.model.request;

import com.ashwani.family.infra.model.GenericRequest;
import com.ashwani.family.util.constants.JsonConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter@Setter
public class FindAllPoliciesRequest extends BaseRequest implements GenericRequest {

    @JsonProperty(JsonConstants.HOLDER)
    private Long holder;
}
