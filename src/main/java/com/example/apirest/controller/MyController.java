package com.example.apirest.controller;

import com.example.apirest.entities.Courses.Courses;
import com.example.apirest.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000") // Allow requests from http://localhost:3000
public class MyController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String home(){
        return "Welcome to courses application";
    }

    @GetMapping("/courses")
    public List<Courses> getCourses(){
        return this.courseService.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Courses getCourse(@PathVariable String courseId){
        return this.courseService.getCourse(Long.parseLong(courseId));
    }

    @PostMapping("/courses")
    public Courses addCourse(@RequestBody Courses course){
        return  this.courseService.addCourse(course);
    }

    @PutMapping("/courses")
    public Courses updateCourse(@RequestBody Courses courses){
        return this.courseService.updateCourse(courses);
    }

    @DeleteMapping("/courses/{coursesId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String coursesId){
        try {
            this.courseService.deleteCourse(Long.parseLong(coursesId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
