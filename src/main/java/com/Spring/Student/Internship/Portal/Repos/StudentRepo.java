package com.Spring.Student.Internship.Portal.Repos;

import com.Spring.Student.Internship.Portal.Model.Entites.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
