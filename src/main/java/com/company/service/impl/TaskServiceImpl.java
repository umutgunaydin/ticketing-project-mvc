package com.company.service.impl;

import com.company.dto.TaskDTO;
import com.company.enums.Status;
import com.company.service.TaskService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class TaskServiceImpl extends AbstractMapService<TaskDTO,Long> implements TaskService {

    @Override
    public TaskDTO save(TaskDTO task) {

        if (task.getTaskStatus() == null){
            task.setTaskStatus(Status.OPEN);
        }
        if (task.getAssignedDate()==null){
            task.setAssignedDate(LocalDate.now());
        }

        return super.save(task.getId(),task);
    }

    @Override
    public TaskDTO findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public List<TaskDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteByID(id);
    }

    @Override
    public void update(TaskDTO task) {
        super.update(task.getId(),task);
    }
}
