package com.Spring.Student.Internship.Portal.Model.Dtos.StudentDtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
