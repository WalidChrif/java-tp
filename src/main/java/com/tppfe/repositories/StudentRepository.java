package com.tppfe.repositories;

import com.tppfe.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("studentRepo1")
public interface StudentRepository  {
    Student save(Student student);
    boolean deleteById(long id);
    List<Student> findAll ();
}
