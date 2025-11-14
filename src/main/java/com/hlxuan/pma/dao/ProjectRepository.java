package com.hlxuan.pma.dao;

import com.hlxuan.pma.dao.dto.ChartData;
import com.hlxuan.pma.entities.Project;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ProjectRepository extends CrudRepository<Project, Long> {

    @Override
    public List<Project> findAll();

    @Query(nativeQuery = true, value = "SELECT stage AS label, COUNT(*) AS \"value\" FROM project GROUP BY stage")
    List<ChartData> getProjectStatus();
}
