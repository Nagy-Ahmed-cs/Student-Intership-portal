package com.Spring.Student.Internship.Portal.Model.Entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="Students")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;
    @NotNull(message="please enter your name .......")
    private String studentName ;
    @Email(message = "Enter a valid mail signature !!!!")
    private String studentEmail;
    @NotNull(message = "Enter a Strong password ....")
    private String studentPassword;
    @CreationTimestamp
    private LocalDateTime createAt;
    @UpdateTimestamp
    private LocalDateTime updateAt;
    private LocalDateTime deleteAt;
//    @JsonManagedReference("student-intern")
    @ManyToMany
    @JoinTable(
            name="Applications" ,
            joinColumns=@JoinColumn(name="student_id"),
            inverseJoinColumns = @JoinColumn(name="intern_id"))
    @JsonIgnore
    private List<Intern> interns;


}
