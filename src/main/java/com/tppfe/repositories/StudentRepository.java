package com.tppfe.repositories;

import com.tppfe.models.StudentDTO;

import java.util.List;

public interface StudentRepository {
    StudentDTO saveStudent(StudentDTO studentDTO);
    StudentDTO updateStudent(StudentDTO studentDTO);
    boolean deleteStudent(long id);
    List<StudentDTO> selectAll ();
}
