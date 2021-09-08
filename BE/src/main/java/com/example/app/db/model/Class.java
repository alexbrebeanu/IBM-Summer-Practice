package com.example.app.db.model;



import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "CLASS")
public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "FACULTY")
    private String faculty;
    @ManyToOne(cascade = CascadeType.ALL)
    private User teacher;
    @OneToMany(mappedBy = "classs")
    private List<Lecture> lecturesForClass;

    public Class(Long id, String name, String faculty, User teacher, List<Lecture> lecturesForClass) {
        this.id = id;
        this.name = name;
        this.faculty = faculty;
        this.teacher = teacher;
        this.lecturesForClass = lecturesForClass;
    }

    public Class(){

    }

    public Long getId() { return id; }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public User getTeacher() {
        return teacher;
    }

    public void setTeacher(User teacher) {
        this.teacher = teacher;
    }

    public List<Lecture> getLecturesForClass() {
        return lecturesForClass;
    }

    public void setLecturesForClass(List<Lecture> lecturesForClass) {
        this.lecturesForClass = lecturesForClass;
    }
}
