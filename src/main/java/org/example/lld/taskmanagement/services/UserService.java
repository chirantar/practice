package org.example.lld.taskmanagement.services;

import org.example.lld.taskmanagement.entities.Task;
import org.example.lld.taskmanagement.entities.User;
import org.modelmapper.ModelMapper;

import java.util.*;

public class UserService {
    Map<String, User> users = new HashMap<>();
    private final ModelMapper modelMapper = new ModelMapper();

    public User createUser(User user){
        String id = UUID.randomUUID().toString();
        users.put(id, user);

        return user;
    }

    public User updateUser(User user, String id){
        User temp = null;
        if(user != null && users.containsKey(id)) {
            temp = users.get(id);
            modelMapper.map(user, temp);
        }

        return temp;
    }
}
