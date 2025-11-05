package com.hlxuan.pma.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long projectId;
    private String name;
    private String stage;
    private String description;

    @OneToMany(mappedBy = "theProject")
    private List<Student> students;

    public long getProjectId() {
        return projectId;
    }

    public String getName() {
        return name;
    }

    public String getStage() {
        return stage;
    }

    public String getDescription() {
        return description;
    }

    public Project(String name, String stage, String description){
        this.name = name;
        this.stage = stage;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", name='" + name + '\'' +
                ", stage='" + stage + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Project() {
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
