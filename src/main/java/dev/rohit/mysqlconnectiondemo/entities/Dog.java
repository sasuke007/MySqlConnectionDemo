package dev.rohit.mysqlconnectiondemo.entities;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name="dogs")
public class Dog{

  @Id
  @Column(name="owner_id")
  private Long id;

  @Column(name="breed")
  private String breed;

  @Column(name="color")
  private String color;

  @Column(name="name")
  private String name;

  @OneToOne(mappedBy = "dog")
  private Person person;
}
