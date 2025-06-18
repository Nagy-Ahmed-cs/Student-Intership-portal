package com.Spring.Student.Internship.Portal.Services.Interfaces;

import com.Spring.Student.Internship.Portal.Model.Dtos.StudentDtos.StudentReqDto;
import com.Spring.Student.Internship.Portal.Model.Dtos.StudentDtos.StudentResDto;
import com.Spring.Student.Internship.Portal.Model.Dtos.StudentDtos.StudentUpdateDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    StudentResDto insert(StudentReqDto dto);
    List<StudentResDto>getStudents();
    StudentResDto update(StudentUpdateDto dto);
    String applyForIntern(Integer studentId , Integer internId);
    List<StudentResDto> getStudentsForIntern(Integer internId);

}
