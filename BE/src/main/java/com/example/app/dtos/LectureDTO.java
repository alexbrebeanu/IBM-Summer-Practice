package com.example.app.dtos;

public class LectureDTO {
    public LectureDTO(){
    }

    private Long classId;
    private Long classroomId;

    public LectureDTO(Long classId, Long classroomId) {
        this.classId = classId;
        this.classroomId = classroomId;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public Long getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Long classroomId) {
        this.classroomId = classroomId;
    }
}
