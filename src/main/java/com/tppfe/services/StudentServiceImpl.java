package com.tppfe.services;

import com.tppfe.models.StudentDTO;
import com.tppfe.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "studentService1")
public class StudentServiceImpl implements StudentService{

    StudentRepository studentRepository;

    public StudentServiceImpl(@Qualifier("studentRepo1") StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public StudentDTO saveStudent(StudentDTO studentDTO) {
        return studentRepository.save(studentDTO);
    }

    public StudentDTO updateStudent(StudentDTO studentDTO) {
        return studentRepository.update(studentDTO);
    }

    public Boolean deleteStudent(Long id) {
        return studentRepository.delete(id);
    }

    public List<StudentDTO> findAll() {
        return studentRepository.findAll();
    }


}
