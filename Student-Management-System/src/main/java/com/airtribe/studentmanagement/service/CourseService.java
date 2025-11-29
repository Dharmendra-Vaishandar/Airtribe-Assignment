package com.airtribe.studentmanagement.service;

import com.airtribe.studentmanagement.entity.Course;
import com.airtribe.studentmanagement.exception.CourseNotFoundException;
import com.airtribe.studentmanagement.exception.StudentNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class CourseService {

    Map<Integer, Course> courseMap = new HashMap<>();

    public void addCourse(Course course) {
        courseMap.put(course.getCourseId(), course);
    }

    public void getCourse(int id,String name) throws CourseNotFoundException {
        if (!courseMap.containsKey(id)) {
            throw new CourseNotFoundException("Course not found: " + id + " "+name);
        }
        courseMap.get(id);
    }

    public void getAllCourses() {
        System.out.println("All Course details are given below with course ID and course name");
        for (Course course : courseMap.values()) {
            System.out.println(String.format("Course Detail: {Course Id='%s',Course Name='%s', Course Credit='%s'}", course.getCourseId(), course.getCourseName(),course.getCredits()));
        }
    }
}
