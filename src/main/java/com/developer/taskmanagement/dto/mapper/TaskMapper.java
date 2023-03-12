package com.developer.taskmanagement.dto.mapper;

import com.developer.taskmanagement.dto.request.TaskRequest;
import com.developer.taskmanagement.dto.response.TaskResponse;
import com.developer.taskmanagement.entity.TaskEntity;
import org.mapstruct.factory.Mappers;

public interface TaskMapper {
    TaskMapper MAPPER = Mappers.getMapper(TaskMapper.class);
    TaskEntity fromRequestToEntity(TaskRequest taskRequest);
    TaskResponse fromEntityToResponse(TaskEntity taskEntity);
}
