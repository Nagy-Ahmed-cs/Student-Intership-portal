package com.Spring.Student.Internship.Portal.Services.Interfaces;

import com.Spring.Student.Internship.Portal.Model.Dtos.InternDtos.InternResDto;
import com.Spring.Student.Internship.Portal.Model.Dtos.StudentDtos.StudentResDto;
import com.Spring.Student.Internship.Portal.Model.Entites.Intern;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InternService {

    InternResDto insert(Intern intern,Integer companyId);
    List<InternResDto>getInterns();
    List<InternResDto> findByCompany_CompanyId(Integer companyId);
}
