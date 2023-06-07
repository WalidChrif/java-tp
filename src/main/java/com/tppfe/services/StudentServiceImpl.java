package com.tppfe.services;

import com.tppfe.mappers.StudentMapper;
import com.tppfe.models.StudentDTO;
import com.tppfe.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    private StudentMapper studentMapper;

//    public StudentServiceImpl(@Qualifier("studentRepo1") StudentRepository studentRepository
//    , StudentMapper studentMapper) {
//        this.studentRepository = studentRepository;
//        this.studentMapper = studentMapper;
//    }


    public StudentDTO saveStudent(StudentDTO studentDTO) {
        return studentMapper.convertToDTO(studentRepository.save(studentMapper.convertToStudent(studentDTO)));
    }


    public Boolean deleteStudent(Long id) {
        studentRepository.deleteById(id);
        return true;
    }

    public List<StudentDTO> findAll() {
        return studentMapper.convertToDTOs(studentRepository.findAll());
    }


}
