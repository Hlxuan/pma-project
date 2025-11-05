package com.hlxuan.pma.dao;

import com.hlxuan.pma.entities.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    @Override
    List<Student> findAll();
}
