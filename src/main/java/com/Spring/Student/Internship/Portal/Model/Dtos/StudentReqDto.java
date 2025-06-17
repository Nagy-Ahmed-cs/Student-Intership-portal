package com.Spring.Student.Internship.Portal.Model.Dtos;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentReqDto {
    private String studentName;
    private String studentEmail;
    private String studentPassword;

}
