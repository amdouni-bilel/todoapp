package com.example.todoapp.entities;

import com.example.todoapp.enums.PriorityLevel;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tasks {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private LocalDate taskDate;

    private boolean completed;

    @Enumerated(EnumType.STRING)
    private PriorityLevel priorityLevel;

    @ManyToOne
    private User user;
}

