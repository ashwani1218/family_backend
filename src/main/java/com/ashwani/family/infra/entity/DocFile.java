package com.ashwani.family.infra.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "doc_file")
public class DocFile extends BaseEntity{

    @Id
    private String id;

    @Indexed
    private String title;

    @DBRef
    @JsonIgnore
    private MemberDocument document;

    private Binary file;
}
