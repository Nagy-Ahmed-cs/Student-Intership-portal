package com.Spring.Student.Internship.Portal.Model.Dtos;

import groovy.lang.DelegatesTo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class StudentResDto {
    private Integer studentId;
    private String studentName ;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

}
