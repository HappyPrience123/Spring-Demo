package com.ganesh.spring_demo.dto;

import com.ganesh.spring_demo.model.Teacher;

public class StudentResponse {
    private String message;
    private Teacher student;

    public StudentResponse(String message, Teacher student) {
        this.message = message;
        this.student = student;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Teacher getStudent() {
        return student;
    }

    public void setStudent(Teacher student) {
        this.student = student;
    }
}
