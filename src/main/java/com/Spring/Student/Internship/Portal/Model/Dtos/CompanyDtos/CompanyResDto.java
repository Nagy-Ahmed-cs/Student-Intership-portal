package com.Spring.Student.Internship.Portal.Model.Dtos.CompanyDtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class CompanyResDto {
    private Integer companyId;
    private String companyName ;
    private LocalDateTime createAt;

}
