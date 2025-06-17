package com.Spring.Student.Internship.Portal.Model.Mappers;

import com.Spring.Student.Internship.Portal.Model.Dtos.StudentReqDto;
import com.Spring.Student.Internship.Portal.Model.Dtos.StudentResDto;
import com.Spring.Student.Internship.Portal.Model.Entites.Student;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    StudentResDto toResponse(Student student);
    Student toStudent(StudentReqDto dto);
    List<StudentResDto>toResponses (List<Student>students);
}
