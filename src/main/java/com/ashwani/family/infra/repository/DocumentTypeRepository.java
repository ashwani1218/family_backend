package com.ashwani.family.infra.repository;

import com.ashwani.family.infra.entity.DocumentType;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface DocumentTypeRepository extends MongoRepository<DocumentType, String> {

    public Optional<DocumentType> findByType(String type);
}
