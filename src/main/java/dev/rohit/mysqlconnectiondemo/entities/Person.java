package dev.rohit.mysqlconnectiondemo.entities;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name="persons")
public class Person{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name="name")
  private String name;

  @JoinColumn(name="id",referencedColumnName = "owner_id")
  @OneToOne(cascade = CascadeType.ALL)
  private Dog dog;
}
