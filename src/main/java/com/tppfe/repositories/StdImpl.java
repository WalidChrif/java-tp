package com.tppfe.repositories;

import com.tppfe.entities.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("studentRepo2")
public class StdImpl implements StudentRepository{

    @Override
    public Student save(Student student) {
        return null;
    }


    @Override
    public boolean deleteById(long id) {
        return true;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }
}
