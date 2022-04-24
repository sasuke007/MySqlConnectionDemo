package dev.rohit.mysqlconnectiondemo.entities;

import lombok.Getter;

import javax.persistence.*;


@Entity
@Getter
@Table(name = "talas")
public class Lock{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "color")
  private String color;

  @Column(name = "size")
  private Integer size;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "key_id", referencedColumnName = "id")
  private Key key;

}
