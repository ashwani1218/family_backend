package com.ashwani.family.infra.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "policy")
public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "particular")
    private String particular;

    @ManyToOne
    @JoinColumn(name = "family_member_id",nullable = false)
    private FamilyMember holder;

    @Column(name = "policyNumber")
    private String policyNumber;

    @Column(name = "premiumDate")
    private Date premiumDate;

    @Column(name = "premiumAmount")
    private Integer premiumAmount;

    @Column(name = "maturityDate")
    private Date maturityDate;

    @Column(name = "maturityAmount")
    private String maturityAmount;

    @Column(name = "lastYearOfPayment")
    private String lastYearOfPayment;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Policy policy = (Policy) o;
        return Objects.equals(id, policy.id) &&
                Objects.equals(particular, policy.particular) &&
                Objects.equals(holder, policy.holder) &&
                Objects.equals(policyNumber, policy.policyNumber) &&
                Objects.equals(premiumDate, policy.premiumDate) &&
                Objects.equals(premiumAmount, policy.premiumAmount) &&
                Objects.equals(maturityDate, policy.maturityDate) &&
                Objects.equals(maturityAmount, policy.maturityAmount) &&
                Objects.equals(lastYearOfPayment, policy.lastYearOfPayment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, particular, holder, policyNumber, premiumDate, premiumAmount, maturityDate, maturityAmount, lastYearOfPayment);
    }

    @Override
    public String toString() {
        return "Policy{" +
                "id=" + id +
                ", particular='" + particular + '\'' +
                ", holder='" + holder + '\'' +
                ", policyNumber='" + policyNumber + '\'' +
                ", premiumDate=" + premiumDate +
                ", premiumAmount=" + premiumAmount +
                ", maturityDate=" + maturityDate +
                ", maturityAmount='" + maturityAmount + '\'' +
                ", lastYearOfPayment='" + lastYearOfPayment + '\'' +
                '}';
    }
}
