package com.ashwani.family.infra.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "document_type")
public class DocumentType extends BaseEntity{

    @MongoId(FieldType.OBJECT_ID)
    private String id;

    @Indexed
    private String type;

    @Override
    public String toString() {
        return "DocumentType{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
