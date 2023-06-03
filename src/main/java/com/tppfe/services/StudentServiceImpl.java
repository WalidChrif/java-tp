package com.tppfe.services;

import com.tppfe.models.StudentDTO;
import com.tppfe.repositories.StudentRepositoryIpml;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "studentService1")
public class StudentServiceImpl implements StudentService{

    StudentRepositoryIpml studentRepositoryIpml;

    public StudentServiceImpl(@Qualifier("studentRepo1") StudentRepositoryIpml studentRepositoryIpml) {
        this.studentRepositoryIpml = studentRepositoryIpml;
    }

    public StudentDTO saveStudent(StudentDTO studentDTO) {
        return studentRepositoryIpml.saveStudent(studentDTO);
    }

    public StudentDTO updateStudent(StudentDTO studentDTO) {
        return studentRepositoryIpml.updateStudent(studentDTO);
    }

    public boolean deleteStudent(long id) {
        return studentRepositoryIpml.deleteStudent(id);
    }

    public List<StudentDTO> selectAll() {
        return studentRepositoryIpml.selectAll();
    }


}
