package org.example.lld.taskmanagement.entities;


import lombok.Getter;
import lombok.Setter;
import org.example.lld.taskmanagement.enums.Priority;
import org.example.lld.taskmanagement.enums.TaskStatus;

import java.time.LocalDateTime;

@Getter
@Setter
public class Task {
    private String id;
    private String header;
    private String description;
    private Priority priority;
    private TaskStatus status;
    private String createdByUserId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String assignedUserId;
    private String sprintId;
}
