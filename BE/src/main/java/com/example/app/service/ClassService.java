package com.example.app.service;

import java.util.List;
import java.util.Optional;

import com.example.app.db.model.Class;
import com.example.app.db.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassService {

    @Autowired ClassRepository classRepository;

    public List<Class> getAllClasses(){return classRepository.findAll();}

    public Optional<Class> findClass(Long id){return classRepository.findById(id);}

    public void addClass(Class c){classRepository.save(c);}

    public void deleteClass(Long id){classRepository.deleteById(id);}
}
