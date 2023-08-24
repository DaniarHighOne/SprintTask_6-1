package com.example.SprintTaskORM.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="task_requests")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationRequest {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String courseName;
    private String commentary;
    private String phone;
    private boolean handled;

}
