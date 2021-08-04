package com.example.app.service;

import com.example.app.db.model.Role;
import com.example.app.dtos.UserDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

@Service
public class UserService {

    UserDTO u1 = new UserDTO(
            "Soulja",
            "Boi",
            Role.GUEST,
            1L
    );

    UserDTO u2 = new UserDTO(
            "Tall",
            "Boi",
            Role.GUEST,
            2L
    );

    private List<UserDTO> a = new ArrayList<>(Arrays.asList(u1, u2));

    public List<UserDTO> getAllUsers() {
        return a;
    }

    public void addUser(UserDTO u){
        a.add(u);
    }

    public void updateUser(UserDTO user, Long id){
       
    }

}
