package com.ashwani.family.infra.repository;

import com.ashwani.family.infra.entity.Policy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyRepository extends JpaRepository<Policy, Long> {
}
