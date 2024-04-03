package org.example.lld.taskmanagement.services;

import org.example.lld.taskmanagement.entities.Task;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TaskQueryService {
    TaskService taskService;
    public List<Task> getAllTaskForUser(String userId){
        List<Task> taskList = taskService.getMap().values().stream().filter(task -> task.getAssignedUserId()
                .equals(userId)).collect(Collectors.toList());
        return taskList;
    }

    public List<Task> getAllTaskForSprint(String sprintId){
        List<Task> taskList = taskService.getMap().values().stream().filter(task -> task.getSprintId().equals(sprintId)).collect(Collectors.toList());
        return taskList;
    }


}
