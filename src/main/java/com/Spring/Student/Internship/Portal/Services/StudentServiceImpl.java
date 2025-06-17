package com.Spring.Student.Internship.Portal.Services;

import com.Spring.Student.Internship.Portal.Model.Dtos.StudentReqDto;
import com.Spring.Student.Internship.Portal.Model.Dtos.StudentResDto;
import com.Spring.Student.Internship.Portal.Model.Entites.Student;
import com.Spring.Student.Internship.Portal.Model.Mappers.StudentMapper;
import com.Spring.Student.Internship.Portal.Repos.StudentRepo;
import com.Spring.Student.Internship.Portal.Services.Interfaces.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    StudentRepo studentRepo;
    @Override
    public StudentResDto insert(StudentReqDto dto) {
        Student student=studentMapper.toStudent(dto);
       return studentMapper.toResponse(studentRepo.save(student));
    }

    @Override
    public List<StudentResDto> getStudents() {
        return studentMapper.toResponses(studentRepo.findAll());
    }
}
