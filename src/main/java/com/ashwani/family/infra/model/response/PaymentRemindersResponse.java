package com.ashwani.family.infra.model.response;

import com.ashwani.family.infra.entity.MemberDocument;
import com.ashwani.family.infra.model.GenericResponse;
import com.ashwani.family.util.constants.JsonConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.http.HttpStatus;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
public class PaymentRemindersResponse extends BaseResponse implements GenericResponse {

    @JsonProperty(JsonConstants.DOCUMENTS)
    private List<MemberDocument> documents;

    @Builder
    public PaymentRemindersResponse(HttpStatus httpStatus, String status, String responseCode, String responseDescription, List<MemberDocument> documents) {
        super(httpStatus, status, responseCode, responseDescription);
        this.documents = documents;
    }
}
