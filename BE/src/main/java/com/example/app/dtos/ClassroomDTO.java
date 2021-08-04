package com.example.app.dtos;

import com.example.app.db.model.Facilities;

public class ClassroomDTO {

    public ClassroomDTO(){
    }

    private String location;
    private int capacity;
    private Facilities facilities;

    public ClassroomDTO(String location, int capacity, Facilities facilities) {
        this.location = location;
        this.capacity = capacity;
        this.facilities = facilities;
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
