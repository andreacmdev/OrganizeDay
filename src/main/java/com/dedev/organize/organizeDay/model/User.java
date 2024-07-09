package com.dedev.organize.organizeDay.model;

import javax.persistence.*;
import java.util.List;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String email;
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Task> tasks;

    // Getters and Setters
}
