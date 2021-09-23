package com.ashwani.family.business.controller;

import com.ashwani.family.business.service.DocumentService;
import com.ashwani.family.business.service.DocumentTypeService;
import com.ashwani.family.infra.model.request.AddDocumentRequest;
import com.ashwani.family.infra.model.request.AddDocumentTypeRequest;
import com.ashwani.family.infra.model.response.AddDocumentResponse;
import com.ashwani.family.infra.model.response.AddDocumentTypeResponse;
import com.ashwani.family.infra.model.response.GetDocumentTypesResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@Slf4j
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    @Autowired
    private DocumentTypeService documentTypeService;

    @PostMapping("/addDocument")
    public AddDocumentResponse addDocument(@RequestBody AddDocumentRequest request){
        log.info("Add Policy Request [{}]", request);
        return documentService.addDocument(request);
    }

    @GetMapping("/documentTypes")
    public GetDocumentTypesResponse getDocumentTypes(){
        log.info("Get Document types request");
        return documentTypeService.getDocumentTypes();
    }

    @PostMapping("/addDocumentType")
    public AddDocumentTypeResponse addDocumentType(@RequestBody AddDocumentTypeRequest request){
        log.info("Add Document Type Request [{}]",request);
        return documentTypeService.addDocument(request);
    }

}
