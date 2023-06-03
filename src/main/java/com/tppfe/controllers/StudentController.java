package com.tppfe.controllers;

import com.tppfe.models.StudentDTO;
import com.tppfe.services.StudentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    StudentService studentService;

    public StudentController(@Qualifier("studentService1") StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public StudentDTO saveStudent(StudentDTO studentDTO){
        return studentService.saveStudent(studentDTO);
    }

    @PutMapping
    public StudentDTO updateStudent(StudentDTO studentDTO){
        return studentService.updateStudent(studentDTO);
    }

    @DeleteMapping("/{id}")
    public boolean deleteStudent(@PathVariable long id){
        return studentService.deleteStudent(id);
    }

    @GetMapping
    public List<StudentDTO> selectAll(){
       return  studentService.selectAll();
    }

}
