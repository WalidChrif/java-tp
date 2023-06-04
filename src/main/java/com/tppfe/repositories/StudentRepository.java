package com.tppfe.repositories;

import com.tppfe.entities.Student;
import com.tppfe.models.StudentDTO;

import java.util.List;

public interface StudentRepository {
    StudentDTO save(Student student);
    StudentDTO update(Student student);
    Boolean delete(Long id);
    List<StudentDTO> findAll ();
}
