package com.Spring.Student.Internship.Portal.Services;

import com.Spring.Student.Internship.Portal.Model.Dtos.StudentDtos.StudentReqDto;
import com.Spring.Student.Internship.Portal.Model.Dtos.StudentDtos.StudentResDto;
import com.Spring.Student.Internship.Portal.Model.Dtos.StudentDtos.StudentUpdateDto;
import com.Spring.Student.Internship.Portal.Model.Entites.Student;
import com.Spring.Student.Internship.Portal.Model.Mappers.StudentMapper;
import com.Spring.Student.Internship.Portal.Repos.StudentRepo;
import com.Spring.Student.Internship.Portal.Services.Interfaces.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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

    @Override
    public StudentResDto update(StudentUpdateDto dto) {
        Optional<Student>student=studentRepo.findById(dto.getStudentId());
        if(student.isPresent()){
            student.get().setStudentEmail(dto.getStudentEmail());
            student.get().setUpdateAt(LocalDateTime.now());
            student.get().setStudentName(dto.getStudentName());
            return studentMapper.toResponse(studentRepo.save(student.get()));
        }
        else {
            System.out.println("The student is not here ....");
            return null;
        }
    }
}
