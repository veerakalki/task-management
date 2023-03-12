package com.developer.taskmanagement.service;

import com.developer.taskmanagement.dto.request.TaskRequest;
import com.developer.taskmanagement.dto.response.TaskResponse;
import com.developer.taskmanagement.entity.TaskEntity;

import java.util.List;
import java.util.Optional;

public interface TaskService {
    List<TaskEntity>findAllTask();
    Optional<TaskEntity> findByTaskId(Long taskId);

    TaskEntity updateTasK(TaskEntity taskEntity);

    TaskEntity saveTask(TaskEntity taskEntity);

    void deleteTask(Long taskId);



}
