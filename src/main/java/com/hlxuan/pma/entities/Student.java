package com.hlxuan.pma.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long studentId;

    private String name;
    private String wechatId;
    private String email;

    @ManyToMany(cascade = {
            CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.REFRESH,
            CascadeType.PERSIST,
    }, fetch = FetchType.LAZY)
    @JoinTable(
            name = "project_student",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns =  @JoinColumn(name = "project_id")
    )
    private List<Project> projects;

    public Student() {
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProject(List<Project> projects) {
        this.projects = projects;
    }

    public Student(String name, String wechatId, String email) {
        this.name = name;
        this.wechatId = wechatId;
        this.email = email;
    }

    public long getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getWechatId() {
        return wechatId;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "email='" + email + '\'' +
                ", wechatId='" + wechatId + '\'' +
                ", name='" + name + '\'' +
                ", studentId=" + studentId +
                '}';
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWechatId(String wechatId) {
        this.wechatId = wechatId;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
