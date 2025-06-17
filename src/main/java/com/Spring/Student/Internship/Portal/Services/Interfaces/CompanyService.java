package com.Spring.Student.Internship.Portal.Services.Interfaces;

import com.Spring.Student.Internship.Portal.Model.Dtos.CompanyDtos.CompanyReqDto;
import com.Spring.Student.Internship.Portal.Model.Dtos.CompanyDtos.CompanyResDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CompanyService {
    CompanyResDto insert(CompanyReqDto dto);
    List<CompanyResDto>getCompanies();



}
