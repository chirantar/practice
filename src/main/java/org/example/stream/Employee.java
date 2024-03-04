package org.example.stream;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    private List<String> projects;
}
