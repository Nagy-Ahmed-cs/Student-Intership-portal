package com.Spring.Student.Internship.Portal.Controller;

import com.Spring.Student.Internship.Portal.Model.Dtos.StudentReqDto;
import com.Spring.Student.Internship.Portal.Model.Dtos.StudentResDto;
import com.Spring.Student.Internship.Portal.Services.Interfaces.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("/insert-student")
    public StudentResDto insert(@RequestBody StudentReqDto dto){
        return studentService.insert(dto);
    }
    @GetMapping("/get-students")
    public List<StudentResDto> getStudents(){
        return studentService.getStudents();
    }
}
