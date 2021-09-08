package com.example.app.db.model;

import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;


@Entity
@Table(name = "CLASSROOM")
public class Classroom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "LOCATION")
    private String location;
    @Column(name = "CAPACITY")
    private int capacity;
    @Column(name = "FACILITIES")
    private Facilities facilities;
    @OneToMany(mappedBy = "classroom")
    private List<Lecture> lecturesInClassroom;

    public Classroom(Long id, String location, int capacity, Facilities facilities, List<Lecture> lecturesInClassroom) {
        this.id = id;
        this.location = location;
        this.capacity = capacity;
        this.facilities = facilities;
        this.lecturesInClassroom = lecturesInClassroom;
    }

    public Classroom() {
    }

    public List<Lecture> getLecturesInClassroom() {
        return lecturesInClassroom;
    }

    public void setLecturesInClassroom(List<Lecture> lecturesInClassroom) {
        this.lecturesInClassroom = lecturesInClassroom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Facilities getFacilities() {
        return facilities;
    }

    public void setFacilities(Facilities facilities) {
        this.facilities = facilities;
    }
}
