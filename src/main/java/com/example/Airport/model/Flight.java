package com.example.Airport.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Flight {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    private String flightNumber;
    private String seat;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "PLANE_FK")
    private Plane plane;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "PASSENGER_FK")
    private Passenger passenger;


}
