package com.ashwani.family.infra.model.request;


import com.ashwani.family.infra.model.GenericRequest;
import com.ashwani.family.util.constants.JsonConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor@AllArgsConstructor
@Builder
public class AddMemberRequest extends BaseRequest implements GenericRequest {

    @JsonProperty(JsonConstants.FIRST_NAME)
    private String firstName;

    @JsonProperty(JsonConstants.LAST_NAME)
    private String lastName;
}
