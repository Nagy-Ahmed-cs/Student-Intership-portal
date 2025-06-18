package com.Spring.Student.Internship.Portal.Model.Entites;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import groovy.lang.DelegatesTo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="Companies")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Company {
    private String companyName;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer companyId;
    private String filed;
    @CreationTimestamp
    private LocalDateTime createAt;
    @JsonManagedReference("company-intern")
    @OneToMany(mappedBy = "company")
    private List<Intern>interns;

}
