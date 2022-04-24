package dev.rohit.mysqlconnectiondemo.entities;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name="work_stations")
public class WorkStation{

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name="floor")
  private Integer floor;

  @OneToOne(mappedBy = "workStation")
  private Employee employee;
}
