package com.dedev.organize.organizeDay.model;

import javax.persistence.*;
import java.util.List;

public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Task> tasks;

    //getters e setters
}
