package com.ashwani.family.infra.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Date;

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
    private FamilyMember holder;

    private String documentTitle;

    private String issuerNo;

    private Date issuerDate;

    private Date premiumDate;

    private Integer premiumAmount;

    private Date maturityDate;

    private String maturityAmount;

    private String lastYearOfPayment;

    private Date createAt;

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
