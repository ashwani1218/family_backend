package com.ashwani.family.infra.repository;

import com.ashwani.family.infra.entity.DocFile;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FileRepository extends MongoRepository<DocFile, String> {
    List<DocFile> findAllByTitle(String title);
}
