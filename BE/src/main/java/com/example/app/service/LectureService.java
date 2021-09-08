package com.example.app.service;

import com.example.app.db.model.Lecture;
import com.example.app.db.repository.LectureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LectureService {

    @Autowired LectureRepository lectureRepository;

    public List<Lecture> getAllLecture(){return lectureRepository.findAll();}

    public Optional<Lecture> findLecture(Long id){return lectureRepository.findById(id);}

    public void addLecture(Lecture lecture){lectureRepository.save(lecture);}

    public void deleteLecture(Long id){lectureRepository.deleteById(id);}


}
