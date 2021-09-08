package com.example.app.service;

import com.example.app.db.model.User;
import com.example.app.db.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {

    @Autowired UserRepository userRepository;

    public List<User> getAllUsers(){return userRepository.findAll();}

    public Optional<User> findUser(Long id){return userRepository.findById(id);}

    public void addUser(User user){userRepository.save(user);}

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}
