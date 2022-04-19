package dev.rohit.mysqlconnectiondemo.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="email")
    private String email;
}
