package com.Spring.Student.Internship.Portal.Model.Entites;

import groovy.lang.DelegatesTo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

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

}
