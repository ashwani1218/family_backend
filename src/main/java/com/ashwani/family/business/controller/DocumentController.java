package com.ashwani.family.business.controller;

import com.ashwani.family.business.service.DocumentService;
import com.ashwani.family.infra.model.request.AddDocumentRequest;
import com.ashwani.family.infra.model.response.AddDocumentResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@Slf4j
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    @PostMapping("/addDocument")
    public AddDocumentResponse addDocument(@RequestBody AddDocumentRequest request){
        log.info("Add Policy Request [{}]", request);
        return documentService.addDocument(request);
    }

}
