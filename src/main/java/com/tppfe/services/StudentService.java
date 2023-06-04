package com.tppfe.services;

import com.tppfe.models.StudentDTO;

import java.util.List;

public interface StudentService {

    Long saveStudent(StudentDTO studentDTO);
    Long updateStudent(StudentDTO studentDTO);
    boolean deleteStudent(Long id);
    List<StudentDTO> selectAll();



}
