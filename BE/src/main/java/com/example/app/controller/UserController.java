package com.example.app.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.app.db.model.Role;
import com.example.app.db.model.User;
import com.example.app.dtos.UserDTO;
import com.example.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public List<UserDTO> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping()
    public void addUser(@RequestBody UserDTO u){
        userService.addUser(u);
    }

    @PutMapping("/{id}")
    public void updateUser(@RequestBody UserDTO u, @PathVariable Long id ){
        userService.updateUser(u);
    }
}



