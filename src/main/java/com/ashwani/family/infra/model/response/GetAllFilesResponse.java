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
public class GetAllFilesResponse extends BaseResponse implements GenericResponse {

    @JsonProperty(JsonConstants.FILES)
    private List<DocFile> files;

    @Builder
    public GetAllFilesResponse(HttpStatus httpStatus, String status, String responseCode, String responseDescription, List<DocFile> files) {
        super(httpStatus, status, responseCode, responseDescription);
        this.files = files;
    }
}
