package dev.rohit.mysqlconnectiondemo.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "addresses")
public class Address {

    @Id
    @Column(name = "user_id")
    private Long id;

    @Column(name = "street")
    private String street;

    @Column(name = "city")
    private String city;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;
}
