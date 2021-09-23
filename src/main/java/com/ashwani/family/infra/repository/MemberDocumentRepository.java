package com.ashwani.family.infra.repository;

import com.ashwani.family.infra.entity.FamilyMember;
import com.ashwani.family.infra.entity.MemberDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MemberDocumentRepository extends MongoRepository<MemberDocument, String> {
    public List<MemberDocument> findAllByHolder(FamilyMember holder);
}
