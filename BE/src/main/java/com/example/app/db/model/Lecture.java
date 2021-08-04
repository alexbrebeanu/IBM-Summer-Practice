package com.example.app.db.model;



import javax.persistence.*;
import java.util.UUID;
import java.util.List;

@Entity
public class Lecture {
    @Id
    @GeneratedValue
    private Long id;
    private int startTime;
    private int endTime;
    @ManyToOne
    private Class classs;
    @ManyToOne
    private Classroom classroom;
    @ManyToMany
    private List<User> enrolledStudents;


    public Lecture(Long id, int startTime, int endTime, Class classs, Classroom classroom, List<User> enrolledStudents) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.classs = classs;
        this.classroom = classroom;
        this.enrolledStudents = enrolledStudents;
    }

    public Lecture() {

    }

    public Class getClasss() {
        return classs;
    }

    public void setClasss(Class classs) {
        this.classs = classs;
    }

    public List<User> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(List<User> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public Class getLass() {
        return classs;
    }

    public void setLass(Class clas) {
        this.classs = clas;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
}
