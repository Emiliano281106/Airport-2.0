package com.example.Airport.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;

@Entity
public class Passenger {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    private String name;
    private String surname;
    private String DNI;
    private int age;
    @ManyToMany(mappedBy = "passengers", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Plane> planes;

    public Passenger() {
    }
    public Passenger(String id, String name, String surname, String DNI, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.DNI = DNI;
        this.age = age;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
