package com.example.app.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.app.db.model.User;
import com.example.app.dtos.UserDTONames;
import com.example.app.exception.ResourceNotFoundException;
import com.example.app.service.MappingService;
import com.example.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired private UserService userService;

    @Autowired private MappingService mappingService;

    @GetMapping()
    public List<UserDTONames> getAllUsers(){
        List<User> users = userService.getAllUsers();
        return users.stream()
                .map(a -> mappingService.entityToUserDTONames(a))
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public UserDTONames getUserById(@PathVariable Long id){
        Optional<User> userOpt = userService.findUser(id);
        User user = userOpt.orElseThrow(ResourceNotFoundException.RESOURCE_NOT_FOUND_SUPPLIER);
        return mappingService.entityToUserDTONames(user);
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public void addUser(@RequestBody User user){userService.addUser(user);}

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){userService.deleteUser(id);}
}



