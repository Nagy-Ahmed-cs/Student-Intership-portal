package com.Spring.Student.Internship.Portal.Model.Mappers;

import com.Spring.Student.Internship.Portal.Model.Dtos.StudentDtos.StudentReqDto;
import com.Spring.Student.Internship.Portal.Model.Dtos.StudentDtos.StudentResDto;
import com.Spring.Student.Internship.Portal.Model.Dtos.StudentDtos.StudentUpdateDto;
import com.Spring.Student.Internship.Portal.Model.Entites.Student;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    StudentResDto toResponse(Student student);
    Student toStudent(StudentReqDto dto);
    List<StudentResDto>toResponses (List<Student>students);
    Student toStudent(StudentUpdateDto dto);
}
