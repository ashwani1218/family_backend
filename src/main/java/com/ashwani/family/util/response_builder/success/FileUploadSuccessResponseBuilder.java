package com.ashwani.family.util.response_builder.success;

import com.ashwani.family.infra.entity.DocFile;
import com.ashwani.family.infra.model.response.AddFileResponse;
import com.ashwani.family.infra.model.response.BaseResponse;
import com.ashwani.family.infra.model.response.GetAllFilesResponse;
import com.ashwani.family.infra.model.response.GetFileResponse;
import com.ashwani.family.util.constants.ResponseConstants;
import com.ashwani.family.util.response_builder.BaseSuccessResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileUploadSuccessResponseBuilder {

    @Autowired
    private BaseSuccessResponseBuilder baseSuccessResponseBuilder;

    public AddFileResponse successResponse(DocFile file){
        var baseResponse = baseSuccessResponseBuilder.baseSuccessResponse();
        return AddFileResponse.builder()
                .httpStatus(baseResponse.getHttpStatus())
                .responseCode(baseResponse.getResponseCode())
                .status(baseResponse.getStatus())
                .responseDescription(ResponseConstants.ADD_FILE_SUCCESS)
                .file(file)
                .build();
    }

    public GetFileResponse getFileSuccess(List<DocFile> file) {
        var baseResponse = baseSuccessResponseBuilder.baseSuccessResponse();
        return  GetFileResponse.builder()
                .file(file)
                .httpStatus(baseResponse.getHttpStatus())
                .responseCode(baseResponse.getResponseCode())
                .status(baseResponse.getStatus())
                .responseDescription(ResponseConstants.GET_FILE_SUCCESS)
                .build();
    }

    public GetAllFilesResponse getAllFilesSuccess(List<DocFile> files) {

        var baseResponse = baseSuccessResponseBuilder.baseSuccessResponse();
        return GetAllFilesResponse.builder()
                .files(files)
                .httpStatus(baseResponse.getHttpStatus())
                .responseCode(baseResponse.getResponseCode())
                .status(baseResponse.getStatus())
                .responseDescription(ResponseConstants.GET_FILE_SUCCESS)
                .build();

    }
}
