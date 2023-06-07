package com.tppfe.controllers;

import com.tppfe.models.StudentDTO;
import com.tppfe.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

//    public StudentController(@Qualifier("studentService1") StudentService studentService) {
//        this.studentService = studentService;
//    }
    @PostMapping
    public StudentDTO saveStudent(StudentDTO studentDTO){
        return studentService.saveStudent(studentDTO);
    }
    @DeleteMapping("/{id}")
    public Boolean deleteStudent(@PathVariable Long id){
        return studentService.deleteStudent(id);
    }

    @GetMapping
    public List<StudentDTO> findAll(){
       return  studentService.findAll();
    }

}
