package com.Spring.Student.Internship.Portal.Controller;

import com.Spring.Student.Internship.Portal.Model.Dtos.CompanyDtos.CompanyReqDto;
import com.Spring.Student.Internship.Portal.Model.Dtos.CompanyDtos.CompanyResDto;
import com.Spring.Student.Internship.Portal.Services.Interfaces.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class CompanyController {
    @Autowired
    CompanyService companyService;
    @GetMapping("/insert-company")
    public CompanyResDto insert(@RequestBody CompanyReqDto dto){
        return companyService.insert(dto);
    }
    @GetMapping("/get-companies")
    public List<CompanyResDto>getCompanies(){
        return companyService.getCompanies();
    }
}
