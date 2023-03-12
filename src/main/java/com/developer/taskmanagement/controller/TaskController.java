package com.developer.taskmanagement.controller;

import com.developer.taskmanagement.dto.request.TaskRequest;
import com.developer.taskmanagement.dto.response.TaskResponse;
import com.developer.taskmanagement.entity.TaskEntity;
import com.developer.taskmanagement.service.TaskService;
import javafx.concurrent.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private final TaskService taskService;


    public TaskController(TaskService taskService) {
        this.taskService = taskService;

    }

    @GetMapping
    public List<TaskEntity> findAllTask() {
        return taskService.findAllTask();
    }

    @GetMapping("/{id}")
    public Optional<TaskEntity> findByTaskId(@PathVariable("id") Long taskId) {
        return taskService.findByTaskId(taskId);
    }

    @PostMapping
    public TaskEntity saveTask(@RequestBody TaskEntity taskEntity) {
        return taskService.saveTask(taskEntity);
    }

    @PutMapping
    public TaskEntity updateTask(@RequestBody TaskEntity taskEntity) {
        return taskService.updateTasK(taskEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable("id") Long id) {
        taskService.deleteTask(id);

    }
}