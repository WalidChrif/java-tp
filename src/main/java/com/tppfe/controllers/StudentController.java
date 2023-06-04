package com.tppfe.controllers;

import com.tppfe.models.StudentDTO;
import com.tppfe.services.StudentService;
import com.tppfe.services.StudentServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private StudentService studentService;
    public static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);

    public StudentController(@Qualifier("studentService1") StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Long saveStudent(@RequestBody StudentDTO studentDTO){
        LOGGER.debug("Controller.save() StudentDTO : {}" + studentDTO);
        return studentService.saveStudent(studentDTO);
    }

    @PutMapping
    public Long updateStudent(@RequestBody StudentDTO studentDTO){
        LOGGER.debug("Controller.update() StudentDTO : {}" + studentDTO);
        return studentService.updateStudent(studentDTO);
    }

    @DeleteMapping("/{ids}")
    public boolean deleteStudent(@PathVariable("ids") long id){
        LOGGER.debug("Controller.delete() StudentDTO id : {}" + id);
        return studentService.deleteStudent(id);
    }

    @GetMapping
    public List<StudentDTO> selectAll(){
        LOGGER.debug("Controller.selectAll()" );
       return  studentService.selectAll();
    }

}
