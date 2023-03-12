package com.developer.taskmanagement.service.impl;

import com.developer.taskmanagement.dto.request.TaskRequest;
import com.developer.taskmanagement.dto.response.TaskResponse;
import com.developer.taskmanagement.entity.TaskEntity;
import com.developer.taskmanagement.repository.TaskRepository;
import com.developer.taskmanagement.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public  class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<TaskEntity> findAllTask() {
        return taskRepository.findAll();
    }

    @Override
    public Optional<TaskEntity> findByTaskId(Long taskId) {
        return taskRepository.findById(taskId);
    }

    @Override
    public TaskEntity updateTasK(TaskEntity taskEntity) {
        return taskRepository.save(taskEntity);
    }

    @Override
    public TaskEntity saveTask(TaskEntity taskEntity) {
        return taskRepository.save(taskEntity);
    }


    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);

    }



}
