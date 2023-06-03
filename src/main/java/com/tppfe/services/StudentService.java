package com.tppfe.services;

import com.tppfe.models.StudentDTO;

import java.util.List;

public interface StudentService {

    StudentDTO saveStudent(StudentDTO studentDTO);
    StudentDTO updateStudent(StudentDTO studentDTO);
    boolean deleteStudent(long id);
    List<StudentDTO> selectAll();



}
