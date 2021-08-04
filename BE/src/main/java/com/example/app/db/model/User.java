package com.example.app.db.model;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.util.UUID;
import java.util.List;

@Entity
public class User {

        @Id
        @GeneratedValue
        private Long id;
        private String firstName;
        private String lastName;
        private int startYear;
        private String faculty;
        private Role role;
        @OneToMany
        private List<Class> classesTaught;
        @ManyToMany
        private List<Lecture> lecturesEnrolled;

        public User(Long id, String firstName, String lastName, int startYear, String faculty, Role role, List<Class> classesTauhht, List<Lecture> lecturesEnrolled) {
                this.id = id;
                this.firstName = firstName;
                this.lastName = lastName;
                this.startYear = startYear;
                this.faculty = faculty;
                this.role = role;
                this.classesTaught = classesTauhht;
                this.lecturesEnrolled = lecturesEnrolled;
        }

        public User(){

        }

        public List<Class> getClassesTauhht() {
                return classesTaught;
        }

        public void setClassesTauhht(List<Class> classesTauhht) {
                this.classesTaught = classesTauhht;
        }

        public List<Lecture> getLecturesEnrolled() {
                return lecturesEnrolled;
        }

        public void setLecturesEnrolled(List<Lecture> lecturesEnrolled) {
                this.lecturesEnrolled = lecturesEnrolled;
        }
        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public int getStartYear() {
                return startYear;
        }

        public void setStartYear(int startYear) {
                this.startYear = startYear;
        }

        public String getFaculty() {
                return faculty;
        }

        public void setFaculty(String faculty) {
                this.faculty = faculty;
        }

        public Role getRole() {
                return role;
        }

        public void setRole(Role role) {
                this.role = role;
        }

        //This constructor is for testing reasons.
        public User(int id, String firstName, String lastName, Role role, int startYear, String faculty){
        }
}

