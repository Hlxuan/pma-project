package com.hlxuan.pma.controllers;

import com.hlxuan.pma.dao.ProjectRepository;
import com.hlxuan.pma.dao.StudentRepository;
import com.hlxuan.pma.dao.dto.StudentProject;
import com.hlxuan.pma.entities.Project;
import com.hlxuan.pma.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    ProjectRepository projectRepository;

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/")
    public String displayHome(Model model){

        List<Project> projects = projectRepository.findAll();
        model.addAttribute("projects", projects);

        List<StudentProject> StudentProjects = studentRepository.studentProjects();
        model.addAttribute("studentProjects", StudentProjects);

        return "main/home";
    }
}
