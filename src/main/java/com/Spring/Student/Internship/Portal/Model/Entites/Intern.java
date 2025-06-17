package com.Spring.Student.Internship.Portal.Model.Entites;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="Interns")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Intern {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer internId;
    private String internName;
    @CreationTimestamp
    private LocalDateTime createAt;
    private Integer period;
    private Integer capacity;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

}
