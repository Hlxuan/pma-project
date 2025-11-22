package com.hlxuan.pma.controllers;

import com.hlxuan.pma.dao.StudentRepository;
import com.hlxuan.pma.entities.Student;
import com.hlxuan.pma.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping
    public String displayStudents(Model model){

        List<Student> students = studentService.getAll();
        model.addAttribute("students",students);
        return "students/list-students";
    }

    @GetMapping("/new")
    public String displayStudentForm(Model model){

        Student aStudent = new Student();
        model.addAttribute("student", aStudent);
        return "students/new-student";
    }

    @PostMapping("/save")
    public String createStudent(Model model, Student student){
        studentService.save(student);

        return "redirect:/students/new";
    }
}
