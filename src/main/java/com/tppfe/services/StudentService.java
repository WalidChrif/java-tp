package com.tppfe.services;

import com.tppfe.models.StudentDTO;

import java.util.List;

public interface StudentService {

    StudentDTO saveStudent(StudentDTO studentDTO);
    StudentDTO updateStudent(StudentDTO studentDTO);
    Boolean deleteStudent(Long id);
    List<StudentDTO> findAll();



}
