package com.company.service;

import com.company.dto.TaskDTO;
import com.company.dto.UserDTO;

import java.util.List;

public interface TaskService extends CrudService<TaskDTO,Long>{

    List<TaskDTO> findTasksByManager(UserDTO manager);

}
