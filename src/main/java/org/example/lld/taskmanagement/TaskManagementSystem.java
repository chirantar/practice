package org.example.lld.taskmanagement;

import org.example.lld.taskmanagement.entities.Task;
import org.example.lld.taskmanagement.entities.User;
import org.example.lld.taskmanagement.services.TaskQueryService;
import org.example.lld.taskmanagement.services.TaskService;
import org.example.lld.taskmanagement.services.UserService;

import java.util.List;

public class TaskManagementSystem {
    private final UserService userService;
    private final TaskService taskService;
    private final TaskQueryService taskQueryService;

    public TaskManagementSystem(UserService userService, TaskService taskService, TaskQueryService taskQueryService){
        this.userService = userService;
        this.taskService = taskService;
        this.taskQueryService = taskQueryService;
    }

    public User addUser(User user){
        return userService.createUser(user);
    }

    public Task addTask(Task task){
        return taskService.createTask(task);
    }

    public boolean assignTaskToUser(Task task, User user){
        if(task == null || user == null)
            return false;
        return taskService.assignTask(user, task);
    }

    public List<Task> getAllTaskByUser(String userId){
        return taskQueryService.getAllTaskForUser(userId);
    }
}
