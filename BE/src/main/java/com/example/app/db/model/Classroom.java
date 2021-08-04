package com.example.app.db.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.UUID;


@Entity
public class Classroom {

    @Id
    @GeneratedValue
    private Long id;
    private String location;
    private int capacity;
    private Facilities facilities;
    @OneToMany
    private List<Classroom> lecturesInClassroom;

    public Classroom(Long id, String location, int capacity, Facilities facilities, List<Classroom> lecturesInClassroom) {
        this.id = id;
        this.location = location;
        this.capacity = capacity;
        this.facilities = facilities;
        this.lecturesInClassroom = lecturesInClassroom;
    }

    public Classroom() {
    }

    public List<Classroom> getLecturesInClassroom() {
        return lecturesInClassroom;
    }

    public void setLecturesInClassroom(List<Classroom> lecturesInClassroom) {
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
