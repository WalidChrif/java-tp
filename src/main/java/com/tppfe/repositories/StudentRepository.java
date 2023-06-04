package com.tppfe.repositories;

import com.tppfe.models.StudentDTO;

import java.util.List;

public interface StudentRepository {
    StudentDTO save(StudentDTO studentDTO);
    StudentDTO update(StudentDTO studentDTO);
    Boolean delete(Long id);
    List<StudentDTO> findAll ();
}
