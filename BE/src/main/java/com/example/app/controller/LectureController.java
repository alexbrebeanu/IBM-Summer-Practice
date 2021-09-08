package com.example.app.controller;

import com.example.app.db.model.Classroom;
import com.example.app.db.model.Lecture;
import com.example.app.service.LectureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/lecture")
public class LectureController {

    @Autowired
    LectureService lectureService;

    @GetMapping()
    public List<Lecture> getAllLectures(){
        return lectureService.getAllLecture();
    }

    @GetMapping("/{id}")
    public Optional<Lecture> getLectureById(@PathVariable Long id){
        return lectureService.findLecture(id);
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public void addClassroom (@RequestBody Lecture lecture){
        lectureService.addLecture(lecture);
    }

    @DeleteMapping("/{id}")
    public void deleteLecture(@PathVariable Long id){
        lectureService.deleteLecture(id);
    }


}
