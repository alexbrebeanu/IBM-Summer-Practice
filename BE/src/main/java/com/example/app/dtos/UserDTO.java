package com.example.app.dtos;

import com.example.app.db.model.Role;

public class UserDTO {
    public UserDTO(){
    }
    private String firstName;
    private String lastName;
    private Role role;

    public UserDTO(String firstName, String lastName, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    //From now for testing purposes ***********************************************

    private Long id;

    public UserDTO(String firstName, String lastName, Role role, Long id) {
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
}
