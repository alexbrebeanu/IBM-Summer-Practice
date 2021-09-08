package com.example.app.controller;

import com.example.app.db.model.Class;
import com.example.app.service.ClassService;
import com.example.app.service.MappingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/class")
public class ClassController {

    @Autowired ClassService classService;

    @Autowired MappingService mappingService;

    @GetMapping()
    public List<Class> getAllClasses(){return classService.getAllClasses();}

    @GetMapping("/{id}")
    public Optional<Class> getClassById(@PathVariable Long id){return classService.findClass(id);}

    @PostMapping(consumes = "application/json", produces = "application/json")
    public void addMapping(@RequestBody Class clas){
        classService.addClass(clas);
    }

    @DeleteMapping("/{id}")
    public void deletaClass(@PathVariable Long id){
        classService.deleteClass(id);
    }
}
