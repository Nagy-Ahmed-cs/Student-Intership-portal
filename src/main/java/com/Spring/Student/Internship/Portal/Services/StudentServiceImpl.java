package com.Spring.Student.Internship.Portal.Services;

import com.Spring.Student.Internship.Portal.Model.Dtos.StudentDtos.StudentReqDto;
import com.Spring.Student.Internship.Portal.Model.Dtos.StudentDtos.StudentResDto;
import com.Spring.Student.Internship.Portal.Model.Dtos.StudentDtos.StudentUpdateDto;
import com.Spring.Student.Internship.Portal.Model.Entites.Intern;
import com.Spring.Student.Internship.Portal.Model.Entites.Student;
import com.Spring.Student.Internship.Portal.Model.Mappers.StudentMapper;
import com.Spring.Student.Internship.Portal.Repos.InternRepo;
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
    @Autowired
    InternRepo internRepo;
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

    @Override
    public String applyForIntern(Integer studentId, Integer internId) {
        Optional<Student>student=studentRepo.findById(studentId);
        Optional<Intern>intern=internRepo.findById(internId);
        if(student.isPresent()&&intern.isPresent()){
            if(intern.get().getCapacity()>=1) {
                intern.get().setCapacity(intern.get().getCapacity()-1);
                student.get().getInterns().add(intern.get());
                intern.get().getStudents().add(student.get());

                studentRepo.save(student.get());
                internRepo.save(intern.get());
                return "The student applied successfully for this internship .....\n";
            }
            else {
                return "The intern is full , do not need for additional students ......\n";
            }
        }
        else {
            return "Invalid student or intern :( .......";
        }
    }

    @Override
    public List<StudentResDto> getStudentsForIntern(Integer internId) {
        List<Student>students=studentRepo.findByInterns_InternId(internId);
        if(students.isEmpty()){
            System.out.println("This is intern does not have any student ......\n");
        }
        return studentMapper.toResponses(studentRepo.findByInterns_InternId(internId));
    }
}
