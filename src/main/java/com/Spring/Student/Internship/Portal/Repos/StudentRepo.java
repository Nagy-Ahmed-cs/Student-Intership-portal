package com.Spring.Student.Internship.Portal.Repos;

import com.Spring.Student.Internship.Portal.Model.Entites.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student, Integer> {

    List<Student> findByInterns_InternId(Integer internId);
}
