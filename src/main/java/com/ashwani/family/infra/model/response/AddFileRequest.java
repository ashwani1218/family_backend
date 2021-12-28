package com.ashwani.family.infra.model.response;

import com.ashwani.family.infra.model.GenericRequest;
import com.ashwani.family.infra.model.request.BaseRequest;
import com.ashwani.family.util.constants.JsonConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Data
public class AddFileRequest extends BaseRequest implements GenericRequest {

    @JsonProperty(JsonConstants.DOCUMENT_ID)
    private String documentId;

    @JsonProperty(JsonConstants.FILE)
    private MultipartFile file;
}
