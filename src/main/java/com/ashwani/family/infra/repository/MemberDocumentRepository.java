package com.ashwani.family.infra.repository;

import com.ashwani.family.infra.entity.FamilyMember;
import com.ashwani.family.infra.entity.MemberDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Date;
import java.util.List;

public interface MemberDocumentRepository extends MongoRepository<MemberDocument, String> {

    public List<MemberDocument> findAllByHolder(FamilyMember holder);

    @Query("{'premiumDate' :{$gte: ?0, $lte: ?1}}")
    public List<MemberDocument> findBetween(Date from, Date to);

    @Query("{'premiumDate' :{$gte: ?0}}")
    public List<MemberDocument> findFromToday(Date from);
}
