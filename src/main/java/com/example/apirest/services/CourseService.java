package com.example.apirest.services;

import com.example.apirest.entities.Courses.Courses;

import java.util.List;

public interface CourseService {
    public List<Courses> getCourses();
    public Courses getCourse(long Id);

    public Courses addCourse(Courses course);

    Courses updateCourse(Courses courses);

    void deleteCourse(long l);
}
