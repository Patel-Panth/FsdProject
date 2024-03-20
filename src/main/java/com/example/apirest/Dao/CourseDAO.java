package com.example.apirest.Dao;

import com.example.apirest.entities.Courses.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDAO extends JpaRepository<Courses,Long> {
}
