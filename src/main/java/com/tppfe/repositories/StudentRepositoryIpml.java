package com.tppfe.repositories;

import com.tppfe.entities.Student;
import com.tppfe.models.StudentDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "studentRepo1")
public class StudentRepositoryIpml implements StudentRepository{
    public StudentDTO save(Student student) {
        return null;
    }
    public StudentDTO update(Student student) {
        return null;
    }

    public Boolean delete(Long id) {
        return true;
    }

    public List<StudentDTO> findAll() {
        return null;
    }
}
