package com.example.apirest.services;

import com.example.apirest.Dao.CourseDAO;
import com.example.apirest.entities.Courses.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseDAO courseDAO;
   // List<Courses> list;
    public CourseServiceImpl(){
        /*list=new ArrayList<>();
        list.add(new Courses(111,"java Courses","language"));
    */}
    @Override
    public List<Courses> getCourses() {
        return courseDAO.findAll();
      //  return list ;
    }

    @Override
    public Courses getCourse(long Id) {
       // Courses c= null;
/*        for (Courses courses:list){
            if (courses.getId()==Id){
                c=courses;
                break;
            }
        }
       */ return  courseDAO.getOne(Id);
    }

    @Override
    public Courses addCourse(Courses course) {
       // list.add(course);
        courseDAO.save(course);
        System.out.println("Course is added");
        return course;
    }

    @Override
    public Courses updateCourse(Courses courses) {
       /* list.forEach(e->{
            if (e.getId()==courses.getId()){
                e.setTitle(courses.getTitle());
                e.setDescription(courses.getDescription());
            }
        });
       */
        courseDAO.save(courses);
        return courses;
    }

    @Override
    public void deleteCourse(long l){
       //  list=this.list.stream().filter(e->e.getId()!=l).collect(Collectors.toList());
       Courses courses=courseDAO.getOne(l);
       courseDAO.delete(courses);

    }


}
