package com.Spring.Student.Internship.Portal.Model.Dtos.StudentDtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class StudentUpdateDto {
    private Integer studentId;
    private String studentName ;
    private String StudentEmail;
}
