package com.example.app.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.app.db.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
