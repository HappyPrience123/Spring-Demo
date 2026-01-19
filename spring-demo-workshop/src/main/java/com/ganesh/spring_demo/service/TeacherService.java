package com.ganesh.spring_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganesh.spring_demo.model.Teacher;
import com.ganesh.spring_demo.repository.TeacherRepository;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    // CREATE
    public Teacher createTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }
    
     // FIND BY ID
    public Teacher getTeacherById(Long id) {
        return teacherRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Teacher not found with id: " + id));
    }

    // UPDATE
    public Teacher updateTeacher(Long id, Teacher newTeacher) {
        Teacher existingTeacher = getTeacherById(id);

        existingTeacher.setName(newTeacher.getName());
        existingTeacher.setAddress(newTeacher.getAddress());

        return teacherRepository.save(existingTeacher);
    }

    // DELETE
    public void deleteTeacher(Long id) {
        Teacher teacher = getTeacherById(id);
        teacherRepository.delete(teacher);
    }
}
