package dev.rohit.mysqlconnectiondemo.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "courses")
public class Course{

  @Id
  @Column(name = "id", nullable = false)
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "title")
  private String title;

  @Column(name = "duration")
  private Integer duration;

  @Column(name = "syllabus")
  private String syllabus;

  @OneToMany(mappedBy = "course", cascade = {CascadeType.REMOVE})
  private List<Student> students;

}
