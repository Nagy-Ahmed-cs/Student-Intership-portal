package com.Spring.Student.Internship.Portal.Controller;

import com.Spring.Student.Internship.Portal.Model.Dtos.InternDtos.InternResDto;
import com.Spring.Student.Internship.Portal.Model.Entites.Intern;
import com.Spring.Student.Internship.Portal.Services.Interfaces.InternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InternController {
    @Autowired
    private InternService internService;
    @GetMapping("/add-intern")
    public InternResDto insert(@RequestBody Intern intern,@RequestParam Integer companyId){
        return internService.insert(intern,companyId);
    }
    @GetMapping("/show-interns")
    public List<InternResDto>getInterns(){
        return internService.getInterns();
    }
    @GetMapping("/get-company-interns")
    public List<InternResDto>getCompanyInterns(@RequestParam Integer companyId){
        return internService.findByCompany_CompanyId(companyId);
    }
}
