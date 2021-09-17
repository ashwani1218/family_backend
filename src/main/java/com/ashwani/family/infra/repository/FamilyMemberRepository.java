package com.ashwani.family.infra.repository;

import com.ashwani.family.infra.entity.FamilyMember;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FamilyMemberRepository extends JpaRepository<FamilyMember, Long> {

    public Optional<FamilyMember> findById(Long id);
}
