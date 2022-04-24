package dev.rohit.mysqlconnectiondemo.entities;

import lombok.Getter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Table(name="carts")
public class Cart{

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name="name")
  private String name;

  @OneToMany(mappedBy = "cart")
  private Set<Items> items;
}
