package com.tppfe.repositories;

import com.tppfe.models.StudentDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "studentRepo1")
public class StudentRepositoryIpml implements StudentRepository{
    public StudentDTO save(StudentDTO studentDTO) {
        return null;
    }
    public StudentDTO update(StudentDTO studentDTO) {
        return null;
    }

    public Boolean delete(Long id) {
        return true;
    }

    public List<StudentDTO> findAll() {
        return null;
    }
}
