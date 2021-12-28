package com.ashwani.family.business.controller;

import com.ashwani.family.business.service.DocumentService;
import com.ashwani.family.business.service.FileService;
import com.ashwani.family.infra.entity.DocFile;
import com.ashwani.family.infra.entity.MemberDocument;
import com.ashwani.family.infra.model.response.AddFileResponse;
import com.ashwani.family.infra.model.response.GetAllFilesResponse;
import com.ashwani.family.infra.model.response.GetFileResponse;
import com.ashwani.family.util.response_builder.failed.FileUploadFailureResponseBuilder;
import com.ashwani.family.util.response_builder.success.FileUploadSuccessResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

@RestController
@CrossOrigin("*")
@RequestMapping("/file")
public class FileController {

    @Autowired
    private FileService fileService;

    @Autowired
    private DocumentService documentService;

    @Autowired
    private FileUploadSuccessResponseBuilder successResponseBuilder;

    @Autowired
    private FileUploadFailureResponseBuilder failureResponseBuilder;


    @GetMapping
    public GetAllFilesResponse getAllFiles(){
        List<DocFile> files = fileService.findAll();
        return successResponseBuilder.getAllFilesSuccess(files);
    }

    @GetMapping("/{documentId}")
    public GetFileResponse getFile(@PathVariable String documentId){
        MemberDocument document = documentService.findById(documentId);
        List<DocFile> files = fileService.getFile(document);
        if(!files.isEmpty()){
            return successResponseBuilder.getFileSuccess(files);
        }else {
            return failureResponseBuilder.getFileFailed();
        }
    }


    @PostMapping
    public AddFileResponse addFile(@RequestParam @NonNull String documentId, @RequestParam @NonNull MultipartFile file) throws IOException {
        MemberDocument document = documentService.findById(documentId);
        if(Objects.nonNull(document)){
            var docFile = fileService.addFile(document,file);

            return successResponseBuilder.successResponse(docFile);
        } else {
            return failureResponseBuilder.failResponse();
        }
    }
}
