package com.ashwani.family.business.controller;

import com.ashwani.family.business.service.DocumentService;
import com.ashwani.family.business.service.DocumentTypeService;
import com.ashwani.family.infra.model.request.AddDocumentRequest;
import com.ashwani.family.infra.model.request.AddDocumentTypeRequest;
import com.ashwani.family.infra.model.response.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@Slf4j
@RequestMapping("/document")
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    @Autowired
    private DocumentTypeService documentTypeService;

    @GetMapping
    @Cacheable(value = "documents")
    public GetDocumentResponse getDocuments(){
        log.info("Get all documents request");
        return documentService.getAllDocuments();
    }

    @PostMapping
    public AddDocumentResponse addDocument(@RequestBody AddDocumentRequest request){
        log.info("Add Document Request [{}]", request);
        return documentService.addDocument(request);
    }

    @GetMapping("/type")
    @Cacheable(value = "document_types")
    public GetDocumentTypesResponse getDocumentTypes(){
        log.info("Get Document types request");
        return documentTypeService.getDocumentTypes();
    }

    @PostMapping("/type")
    public AddDocumentTypeResponse addDocumentType(@RequestBody AddDocumentTypeRequest request){
        log.info("Add Document Type Request [{}]",request);
        return documentTypeService.addDocument(request);
    }

    @PutMapping("/markAsPaid/{id}")
    public BaseResponse markAsPaid(@PathVariable String id){
        log.info("Marking Document with id ${id} as paid");
        return documentService.markAsPaid(id);
    }
}
