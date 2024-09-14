package com.javatp.services;

import com.javatp.models.StudentDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentService {

    StudentDTO saveStudent(StudentDTO studentDTO);
    Boolean deleteStudent(Long id);
    List<StudentDTO> findAll();



}
