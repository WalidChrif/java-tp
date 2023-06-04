package com.tppfe.services;

import com.tppfe.mappers.StudentMapper;
import com.tppfe.models.StudentDTO;
import com.tppfe.repositories.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService1")
public class StudentServiceImpl implements StudentService {

    private StudentMapper studentMapper;
    private StudentRepository studentRepository;
    public static final Logger LOGGER = LoggerFactory.getLogger(StudentServiceImpl.class);

    public StudentServiceImpl(@Qualifier("studentRepo2") StudentRepository studentRepository
    ,StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }

    public Long saveStudent(StudentDTO studentDTO) {
        LOGGER.debug("Service.save() StudentDTO :" + studentDTO);
        return studentRepository.save(studentMapper.convertToStudent(studentDTO)).getId();
    }

    public Long updateStudent(StudentDTO studentDTO) {
        LOGGER.debug("Service.update() StudentDTO :" + studentDTO);
        return studentRepository.save(studentMapper.convertToStudent(studentDTO)).getId();
    }

    public boolean deleteStudent(Long id) {
        LOGGER.debug("Student.delete() StudentDTO id :" + id);
        studentRepository.deleteById(id);
        return true;
    }

    public List<StudentDTO> selectAll() {
        LOGGER.debug("Service.selectAll() :");
        return studentMapper.convertToDTOs(studentRepository.findAll());
    }


}
