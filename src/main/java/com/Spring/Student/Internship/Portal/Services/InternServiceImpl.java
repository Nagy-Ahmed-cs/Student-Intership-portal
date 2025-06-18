package com.Spring.Student.Internship.Portal.Services;

import com.Spring.Student.Internship.Portal.Model.Dtos.InternDtos.InternResDto;
import com.Spring.Student.Internship.Portal.Model.Dtos.StudentDtos.StudentResDto;
import com.Spring.Student.Internship.Portal.Model.Entites.Company;
import com.Spring.Student.Internship.Portal.Model.Entites.Intern;
import com.Spring.Student.Internship.Portal.Model.Mappers.InternMapper;
import com.Spring.Student.Internship.Portal.Repos.CompanyRepo;
import com.Spring.Student.Internship.Portal.Repos.InternRepo;
import com.Spring.Student.Internship.Portal.Services.Interfaces.InternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InternServiceImpl implements InternService {
    @Autowired
    InternMapper internMapper;
    @Autowired
    InternRepo internRepo;
    @Autowired
    CompanyRepo companyRepo;
    @Override
    public InternResDto insert(Intern intern,Integer companyId) {
        Optional<Company>company=companyRepo.findById(companyId);
        if(company.isPresent()){
            intern.setCompany(company.get());
            return internMapper.toResponse(internRepo.save(intern));
        }
        System.out.println("Unsuccessful insertion :( \n");
        return null;
    }

    @Override
    public List<InternResDto> getInterns() {
        return internMapper.toResponses(internRepo.findAll());
    }

    @Override
    public List<InternResDto> findByCompany_CompanyId(Integer companyId) {
        List<Intern>interns=internRepo.findByCompany_CompanyId(companyId);
        if(interns.isEmpty()){
            System.out.println("\nThe company is not here or do not publish any internship .......");
            return null;
        }
        else {
            return internMapper.toResponses(interns);
        }
    }



}
