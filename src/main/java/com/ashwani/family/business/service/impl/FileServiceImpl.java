package com.ashwani.family.business.service.impl;

import com.ashwani.family.business.service.FileService;
import com.ashwani.family.infra.entity.DocFile;
import com.ashwani.family.infra.entity.MemberDocument;
import com.ashwani.family.infra.repository.FileRepository;
import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class FileServiceImpl implements FileService {

    @Autowired
    private FileRepository fileRepository;


    @Override
    public DocFile addFile(MemberDocument document, MultipartFile file) throws IOException {
        var docFile = new DocFile();
        docFile.setDocument(document);
        docFile.setTitle(document.getHolder().getFirstName()+" "+document.getDocumentTitle());
        docFile.setFile(
                new Binary(BsonBinarySubType.BINARY, file.getBytes()));
        docFile = fileRepository.insert(docFile);
        return docFile;
    }

    @Override
    public List<DocFile> getFile(MemberDocument document) {
        var title = document.getHolder().getFirstName()+ " " +document.getDocumentTitle();
        return fileRepository.findAllByTitle(title);
    }

    @Override
    public List<DocFile> findAll() {
        return fileRepository.findAll();
    }
}
