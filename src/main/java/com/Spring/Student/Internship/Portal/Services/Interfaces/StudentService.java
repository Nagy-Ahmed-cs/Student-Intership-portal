package com.Spring.Student.Internship.Portal.Services.Interfaces;

import com.Spring.Student.Internship.Portal.Model.Dtos.StudentReqDto;
import com.Spring.Student.Internship.Portal.Model.Dtos.StudentResDto;
import com.Spring.Student.Internship.Portal.Model.Entites.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    StudentResDto insert(StudentReqDto dto);
    List<StudentResDto>getStudents();
}
