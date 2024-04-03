package org.example.lld.taskmanagement.services;

import lombok.Getter;
import lombok.Setter;
import org.example.lld.taskmanagement.entities.Task;
import org.example.lld.taskmanagement.entities.User;
import org.modelmapper.ModelMapper;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Getter
@Setter
public class TaskService {
    private Map<String, Task> map = new HashMap<>();
    private final ModelMapper modelMapper = new ModelMapper();

    public Task createTask(Task task){
        if(task!= null) {
            String id = UUID.randomUUID().toString();
            map.put(id, task);
        }

        return task;
    }

    public Task updateTask(String id, Task task){
        Task temp = null;
        if(task != null && map.containsKey(id)) {
            temp = map.get(id);
            modelMapper.map(task, temp);
        }

        return temp;
    }

    public boolean deleteTask(String id, Task task){
        if(map.containsKey(id)){
            map.remove(id);
            return true;
        }

        return false;
    }

    public boolean assignTask(User user, Task task){
        if(map.containsKey(task.getId())){
            task.setAssignedUserId(user.getUserId());
            return true;
        }

        return false;
    }
}
