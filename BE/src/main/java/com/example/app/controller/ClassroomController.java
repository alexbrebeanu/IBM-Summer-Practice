package com.example.app.controller;

import java.util.List;
import java.util.Optional;

import com.example.app.db.model.Classroom;
import com.example.app.db.model.Lecture;
import com.example.app.service.ClassroomService;
import com.example.app.service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/classroom")
public class ClassroomController {

    @Autowired
    ClassroomService classroomService;

    @GetMapping()
    public List<Classroom> getAllClassrooms(){return classroomService.getAllClassrooms();}

    @GetMapping("/{id}")
    public Optional<Classroom> getClassroomById(@PathVariable Long id){return classroomService.findClassroom(id);}

    @PostMapping(consumes = "application/json", produces = "application/json")
    public void addClassroom(@RequestBody Classroom classroom){classroomService.addClassroom(classroom);}

    @DeleteMapping("/{id}")
    public void deleteClassroom(@PathVariable Long id){classroomService.deleteClassroom(id);}
}
