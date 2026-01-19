package com.ganesh.spring_demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.ganesh.spring_demo.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
