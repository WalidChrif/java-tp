package com.tppfe.mappers;

import com.tppfe.entities.Student;
import com.tppfe.models.StudentDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentMapper {

    private StudentDTO convertToDTO(Student student) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(student.getId());
        studentDTO.setName(student.getName());
        return studentDTO;
    }

    private Student convertToStudent(StudentDTO studentDTO) {
        Student student = new Student();
        student.setId(studentDTO.getId());
        student.setName(studentDTO.getName());
        return student;
    }

    List<StudentDTO> convertToDTOs(List<Student> studentList) {
        if (studentList != null && !studentList.isEmpty())
            return studentList.stream().map(this::convertToDTO).collect(Collectors.toList());
        else return new ArrayList<>();
    }
}
