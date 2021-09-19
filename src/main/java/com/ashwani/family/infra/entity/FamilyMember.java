package com.ashwani.family.infra.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "family_member")
public class FamilyMember {

    @MongoId(FieldType.OBJECT_ID)
    private String id;

    @Indexed
    private String firstName;

    private String lastName;

    @DBRef
    @JsonIgnore
    private Set<Policy> policies;

}
