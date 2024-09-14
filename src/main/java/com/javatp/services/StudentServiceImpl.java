package com.javatp.services;

import com.javatp.mappers.StudentMapper;
import com.javatp.models.StudentDTO;
import com.javatp.repositories.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService1")
public class StudentServiceImpl implements StudentService{

    private static final Logger LOGGER = LoggerFactory.getLogger(StudentServiceImpl.class);
    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    public StudentServiceImpl(@Qualifier("studentRepo1") StudentRepository studentRepository
    , StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }


    public StudentDTO saveStudent(StudentDTO studentDTO) {
        LOGGER.debug("start method saveStudent dto : {} " , studentDTO);
        return studentMapper.convertToDTO(studentRepository.save(studentMapper.convertToStudent(studentDTO)));
    }


    public Boolean deleteStudent(Long id) {
        LOGGER.debug("start method delete Student id : {} " ,id);
        studentRepository.deleteById(id);
        return true;
    }

    public List<StudentDTO> findAll() {
        return studentMapper.convertToDTOs(studentRepository.findAll());
    }


}
