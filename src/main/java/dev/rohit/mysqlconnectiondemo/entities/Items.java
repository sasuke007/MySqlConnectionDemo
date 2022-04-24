package dev.rohit.mysqlconnectiondemo.entities;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name="items")
public class Items{

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name="name")
  private String name;

  @JoinColumn(name="cart_id",referencedColumnName = "id")
  @ManyToOne(fetch = FetchType.LAZY,optional = false)
  private Cart cart;
}
