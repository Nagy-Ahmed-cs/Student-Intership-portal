package com.Spring.Student.Internship.Portal.Repos;

import com.Spring.Student.Internship.Portal.Model.Entites.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepo extends JpaRepository<Company, Integer> {
}
