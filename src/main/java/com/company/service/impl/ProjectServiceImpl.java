package com.company.service.impl;

import com.company.dto.ProjectDTO;
import com.company.service.CrudService;
import com.company.service.ProjectService;

import java.util.List;

public class ProjectServiceImpl extends AbstractMapService<ProjectDTO, String> implements ProjectService {
    @Override
    public ProjectDTO save(ProjectDTO project) {
        return super.save(project.getProjectCode(),project);
    }

    @Override
    public ProjectDTO findById(String projectCode) {
        return super.findByID(projectCode);
    }

    @Override
    public List<ProjectDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(String projectCode) {
        super.deleteByID(projectCode);
    }

    @Override
    public void update(ProjectDTO project) {
        super.update(project.getProjectCode(),project);
    }
}
