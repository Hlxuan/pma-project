package com.hlxuan.pma.services;

import com.hlxuan.pma.dao.StudentRepository;
import com.hlxuan.pma.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student save(Student student){
        return studentRepository.save(student);
    }

    public List<Student> getAll(){
        return studentRepository.findAll();
    }
}
