package com.Spring.Student.Internship.Portal.Model.Mappers;

import com.Spring.Student.Internship.Portal.Model.Dtos.CompanyDtos.CompanyReqDto;
import com.Spring.Student.Internship.Portal.Model.Dtos.CompanyDtos.CompanyResDto;
import com.Spring.Student.Internship.Portal.Model.Entites.Company;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CompanyMapper {
    Company toCompany(CompanyReqDto dto);
    List<CompanyResDto> toResponses(List<Company>companies);
    CompanyResDto toResponse(Company company);
}
