package com.example.app.service;

import com.example.app.db.model.User;
import com.example.app.dtos.UserDTONames;
import org.springframework.stereotype.Service;

@Service
public class MappingService {

    public UserDTONames entityToUserDTONames(User user){
        return new UserDTONames(user.getLastName(), user.getFirstName());
    }
}
