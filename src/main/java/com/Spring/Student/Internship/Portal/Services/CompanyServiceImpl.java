package com.Spring.Student.Internship.Portal.Services;

import com.Spring.Student.Internship.Portal.Model.Dtos.CompanyDtos.CompanyReqDto;
import com.Spring.Student.Internship.Portal.Model.Dtos.CompanyDtos.CompanyResDto;
import com.Spring.Student.Internship.Portal.Model.Entites.Company;
import com.Spring.Student.Internship.Portal.Model.Mappers.CompanyMapper;
import com.Spring.Student.Internship.Portal.Repos.CompanyRepo;
import com.Spring.Student.Internship.Portal.Services.Interfaces.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    CompanyRepo companyRepo;
    @Autowired
    CompanyMapper companyMapper;
    @Override
    public CompanyResDto insert(CompanyReqDto dto) {
        Company company=companyMapper.toCompany(dto);
        return companyMapper.toResponse(companyRepo.save(company));
    }

    @Override
    public List<CompanyResDto> getCompanies() {
        return companyMapper.toResponses(companyRepo.findAll());
    }
}
