package com.example.app.service;

import com.example.app.db.model.Classroom;
import com.example.app.db.repository.ClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassroomService {

    @Autowired ClassroomRepository classroomRepository;

    public List<Classroom> getAllClassrooms(){return classroomRepository.findAll();}

    public Optional<Classroom> findClassroom(Long id){return classroomRepository.findById(id);}

    public void addClassroom (Classroom classroom){classroomRepository.save(classroom);}

    public void deleteClassroom (Long id){classroomRepository.deleteById(id);}
}
