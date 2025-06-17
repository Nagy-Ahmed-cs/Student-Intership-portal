package com.Spring.Student.Internship.Portal.Model.Dtos.CompanyDtos;

import com.Spring.Student.Internship.Portal.Model.Entites.Intern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class CompanyResDto {
    private Integer companyId;
    private String companyName ;
    private LocalDateTime createAt;
    private List<Intern>interns;

}
