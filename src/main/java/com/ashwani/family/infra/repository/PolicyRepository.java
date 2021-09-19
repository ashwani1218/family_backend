package com.ashwani.family.infra.repository;

import com.ashwani.family.infra.entity.Policy;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PolicyRepository extends MongoRepository<Policy, String> {
}
