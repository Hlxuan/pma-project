package com.hlxuan.pma.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hlxuan.pma.dao.ProjectRepository;
import com.hlxuan.pma.dao.StudentRepository;
import com.hlxuan.pma.dao.dto.ChartData;
import com.hlxuan.pma.dao.dto.StudentProject;
import com.hlxuan.pma.entities.Project;
import com.hlxuan.pma.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Value("${version:未获取到}")
    private String version;

    @Autowired
    ProjectRepository projectRepository;

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/")
    public String displayHome(Model model) throws JsonProcessingException {

        model.addAttribute("versionNumber", version);

        List<Project> projects = projectRepository.findAll();
        model.addAttribute("projects", projects);

        List<ChartData> projectStatusData = projectRepository.getProjectStatus();
        // 转换projectStatusData为json格式，方便在JS脚本中使用
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(projectStatusData);
        // [{"未开始", 1}, {"进行中", 2}, {"已完成", 3}]
        model.addAttribute("projectStatusData", jsonString);

        List<StudentProject> StudentProjects = studentRepository.studentProjects();
        model.addAttribute("studentProjects", StudentProjects);

        return "main/home";
    }
}
