package com.ashwani.family.infra.model.response;

import com.ashwani.family.infra.entity.DocFile;
import com.ashwani.family.infra.model.GenericResponse;
import com.ashwani.family.util.constants.JsonConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.http.HttpStatus;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GetFileResponse extends BaseResponse implements GenericResponse {

    @JsonProperty(JsonConstants.FILE)
    private List<DocFile> file;

    @Builder
    public GetFileResponse(HttpStatus httpStatus, String status, String responseCode, String responseDescription, List<DocFile> file) {
        super(httpStatus, status, responseCode, responseDescription);
        this.file = file;
    }
}
