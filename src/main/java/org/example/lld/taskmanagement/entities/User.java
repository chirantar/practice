package org.example.lld.taskmanagement.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class User {
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
}
