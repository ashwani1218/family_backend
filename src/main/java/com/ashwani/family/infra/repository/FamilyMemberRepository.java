package com.ashwani.family.infra.repository;

import com.ashwani.family.infra.entity.FamilyMember;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface FamilyMemberRepository extends MongoRepository<FamilyMember, String> {

    public Optional<FamilyMember> findById(String id);
}
