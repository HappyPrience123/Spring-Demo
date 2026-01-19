package com.ganesh.spring_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ganesh.spring_demo.model.Teacher;
import com.ganesh.spring_demo.service.TeacherService;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    // ✅ CREATE (POST)
    @PostMapping(value = "/insert", produces = "text/plain")
    public String createTeacher(@RequestBody Teacher teacher) {
        teacherService.createTeacher(teacher);
        return "Teacher added successfully";
    }

    // ✅ GET BY ID (SMS STYLE)
    @GetMapping(value = "/{get}", produces = "text/plain")
    public String getTeacherById(@PathVariable Long id) {
        Teacher teacher = teacherService.getTeacherById(id);
        return "Teacher found successfully";
    }

    // ✅ UPDATE
    @PutMapping(value = "/{id}", produces = "text/plain")
    public String updateTeacher(@PathVariable Long id,
                                @RequestBody Teacher teacher) {
        teacherService.updateTeacher(id, teacher);
        return "Teacher updated successfully";
    }

    // ✅ DELETE
    @DeleteMapping(value = "/{id}", produces = "text/plain")
    public String deleteTeacher(@PathVariable Long id) {
        teacherService.deleteTeacher(id);
        return "Teacher deleted successfully";
    }
}


