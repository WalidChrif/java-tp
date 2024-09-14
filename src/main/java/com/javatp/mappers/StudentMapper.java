package com.javatp.mappers;

import com.javatp.entities.Student;
import com.javatp.entities.StudentId;
import com.javatp.models.StudentDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentMapper {

    public StudentDTO convertToDTO(Student student) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(student.getStudentId().getId());
//        studentDTO.setId(student.getId());
        studentDTO.setName(student.getName());
        return studentDTO;
    }

    public Student convertToStudent(StudentDTO studentDTO) {
        Student student = new Student();
        student.setStudentId(new StudentId(studentDTO.getId(),"code"));
//        student.setId(studentDTO.getId());
        student.setName(studentDTO.getName());
        return student;
    }

    public List<StudentDTO> convertToDTOs(List<Student> studentList) {
        if (studentList != null && !studentList.isEmpty())
            return studentList.stream().map(this::convertToDTO).collect(Collectors.toList());
        else return new ArrayList<>();
    }
}
