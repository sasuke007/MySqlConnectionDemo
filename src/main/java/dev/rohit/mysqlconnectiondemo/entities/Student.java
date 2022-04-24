package dev.rohit.mysqlconnectiondemo.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
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

    @JoinColumn(name="course_id",referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Course course;
}
