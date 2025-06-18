package com.Spring.Student.Internship.Portal.Repos;

import com.Spring.Student.Internship.Portal.Model.Entites.Intern;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InternRepo extends JpaRepository<Intern,Integer> {
    List<Intern> findByCompany_CompanyId(Integer companyId);

    List<Intern> findByStudents_StudentId(Integer studentId);


}
