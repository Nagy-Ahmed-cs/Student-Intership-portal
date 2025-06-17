package com.Spring.Student.Internship.Portal.Model.Dtos.CompanyDtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class CompanyReqDto {
    private String companyName;
    private String filed;

}
