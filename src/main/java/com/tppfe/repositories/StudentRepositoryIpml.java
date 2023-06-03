package com.tppfe.repositories;

import com.tppfe.models.StudentDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "studentRepo1")
public class StudentRepositoryIpml implements StudentRepository{
    public StudentDTO saveStudent(StudentDTO studentDTO) {
        return null;
    }

    public StudentDTO updateStudent(StudentDTO studentDTO) {
        return null;
    }

    public boolean deleteStudent(long id) {
        return true;
    }

    public List<StudentDTO> selectAll() {
        return null;
    }
}
