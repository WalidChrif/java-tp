package com.tppfe.controllers;

import com.tppfe.models.StudentDTO;
import com.tppfe.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);
    private final StudentService studentService;

    public StudentController(@Qualifier("studentService1") StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping
    public StudentDTO saveStudent(@RequestBody StudentDTO studentDTO){
        LOGGER.debug("start method saveStudent dto : {} ",studentDTO);
        return studentService.saveStudent(studentDTO);
    }
    @DeleteMapping("/{id}")
    public Boolean deleteStudent(@PathVariable Long id){
        LOGGER.debug("start method delete Student id {} " , id);
        return studentService.deleteStudent(id);
    }

    @GetMapping
    public List<StudentDTO> findAll(){
       return  studentService.findAll();
    }

}
