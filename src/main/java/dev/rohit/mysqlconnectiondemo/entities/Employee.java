package dev.rohit.mysqlconnectiondemo.entities;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name="employees")
public class Employee{

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name="name")
  private String name;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinTable( name = "emp_workstation",
      joinColumns = {
        @JoinColumn(name="employee_id",referencedColumnName = "id")
      },
      inverseJoinColumns = {
        @JoinColumn(name="work_station_id",referencedColumnName = "id")
      }
  )
  private WorkStation workStation;
}
