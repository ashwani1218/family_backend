package com.ashwani.family.util.response_builder.failed;

import com.ashwani.family.infra.model.response.AddFileResponse;
import com.ashwani.family.infra.model.response.BaseResponse;
import com.ashwani.family.infra.model.response.GetFileResponse;
import com.ashwani.family.util.constants.ResponseConstants;
import com.ashwani.family.util.response_builder.BaseFailedResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileUploadFailureResponseBuilder {

    @Autowired
    private BaseFailedResponseBuilder failedResponseBuilder;

    public AddFileResponse failResponse(){
        BaseResponse baseResponse = failedResponseBuilder.baseFailResponse();
        return AddFileResponse.builder()
                .status(baseResponse.getStatus())
                .responseDescription(ResponseConstants.ADD_FILE_FAILURE)
                .responseCode(baseResponse.getResponseCode())
                .httpStatus(baseResponse.getHttpStatus())
                .build();
    }

    public GetFileResponse getFileFailed() {
        BaseResponse baseResponse = failedResponseBuilder.baseFailResponse();
        return GetFileResponse.builder()
                .status(baseResponse.getStatus())
                .responseCode(baseResponse.getResponseCode())
                .httpStatus(baseResponse.getHttpStatus())
                .responseDescription(ResponseConstants.GET_FILE_FAILURE)
                .build();
    }
}
