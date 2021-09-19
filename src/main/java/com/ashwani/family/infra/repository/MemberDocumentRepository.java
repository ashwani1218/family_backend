package com.ashwani.family.infra.repository;

import com.ashwani.family.infra.entity.MemberDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MemberDocumentRepository extends MongoRepository<MemberDocument, String> {
}
