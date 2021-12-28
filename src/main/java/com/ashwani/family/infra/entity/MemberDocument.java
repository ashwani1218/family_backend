package com.ashwani.family.infra.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "document")
public class MemberDocument extends BaseEntity{

    @MongoId(FieldType.OBJECT_ID)
    private String id;

    @DBRef
    private DocumentType particular;

    @DBRef
    @JsonIgnore
    private FamilyMember holder;

    @DBRef
    @JsonIgnore
    private Set<DocFile> files;

    private String documentTitle;

    private String issuerNo;

    private Date issuerDate;

    private Date premiumDate;

    private Integer premiumAmount;

    private Date maturityDate;

    private String maturityAmount;

    private String lastYearOfPayment;

    @CreatedDate
    private Date createAt;

    @LastModifiedDate
    private Date updatedAt;

    @Override
    public String toString() {
        return "MemberDocument{" +
                "id='" + id + '\'' +
                ", particular=" + particular +
                ", holder=" + holder +
                ", documentTitle='" + documentTitle + '\'' +
                ", issuerNo='" + issuerNo + '\'' +
                ", issuerDate=" + issuerDate +
                ", premiumDate=" + premiumDate +
                ", premiumAmount=" + premiumAmount +
                ", maturityDate=" + maturityDate +
                ", maturityAmount='" + maturityAmount + '\'' +
                ", lastYearOfPayment='" + lastYearOfPayment + '\'' +
                ", createAt=" + createAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
