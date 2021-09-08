package com.example.app.dtos;

import com.example.app.db.model.Role;

public class UserDTONames {
    public UserDTONames(){
    }
    private String firstName;
    private String lastName;

    public UserDTONames(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //From now for testing purposes **********************************************
    /*
    private Long id;

    public UserDTONames(String firstName, String lastName, Role role, Long id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

     */
}


