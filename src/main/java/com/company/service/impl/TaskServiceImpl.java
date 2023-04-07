package com.company.service.impl;

import com.company.dto.TaskDTO;
import com.company.service.TaskService;

import java.util.List;

public class TaskServiceImpl extends AbstractMapService<TaskDTO,Long> implements TaskService {

    @Override
    public TaskDTO save(TaskDTO task) {
        return null;
    }

    @Override
    public TaskDTO findById(Long id) {
        return null;
    }

    @Override
    public List<TaskDTO> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void update(TaskDTO task) {

    }
}
