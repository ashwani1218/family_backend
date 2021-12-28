package com.ashwani.family.infra.model.response;

import com.ashwani.family.infra.entity.DocFile;
import com.ashwani.family.infra.model.GenericResponse;
import com.ashwani.family.util.constants.JsonConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.http.HttpStatus;

@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter
@Data
public class AddFileResponse extends BaseResponse implements GenericResponse {

    @JsonProperty(JsonConstants.FILE)
    private DocFile file;

    @Builder
    public AddFileResponse(HttpStatus httpStatus, String status, String responseCode, String responseDescription, DocFile file) {
        super(httpStatus, status, responseCode, responseDescription);
        this.file = file;
    }
}
