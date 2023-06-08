package com.tppfe.repositories;

import com.tppfe.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("studentRepo1")
public interface StudentRepository extends JpaRepository<Student, Long> {

}
