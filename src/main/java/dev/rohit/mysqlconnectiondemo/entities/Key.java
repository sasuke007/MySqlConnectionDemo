package dev.rohit.mysqlconnectiondemo.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "chabbhis")
public class Key{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "length")
  private Integer length;

  @Column(name="security_level")
  private Integer securityLevel;


  @OneToOne(mappedBy = "key")
  private Lock lock;

}
