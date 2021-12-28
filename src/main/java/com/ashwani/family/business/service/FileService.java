package com.ashwani.family.business.service;

import com.ashwani.family.infra.entity.DocFile;
import com.ashwani.family.infra.entity.MemberDocument;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface FileService {
    public DocFile addFile(MemberDocument document, MultipartFile file)  throws IOException;
    public List<DocFile> getFile(MemberDocument document);

    List<DocFile> findAll();
}
