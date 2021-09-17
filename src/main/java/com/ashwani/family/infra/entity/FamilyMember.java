package com.ashwani.family.infra.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "family_member")
public class FamilyMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;


    @OneToMany(mappedBy = "holder")
    private Set<Policy> policies;

}
