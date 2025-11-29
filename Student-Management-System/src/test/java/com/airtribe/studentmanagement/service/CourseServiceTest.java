package com.airtribe.studentmanagement.service;

import com.airtribe.studentmanagement.entity.Course;
import com.airtribe.studentmanagement.exception.CourseNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CourseServiceTest {
    private CourseService courseService;

    @BeforeEach
    void setup() {
        courseService = new CourseService();
    }

    @Test
    void addAndGetStudent() {
        Course s = new Course(1, "Java", 20);
        courseService.addCourse(s);
        courseService.getAllCourses();
    }

    @Test
    void getStudentNotFound() {
        assertThrows(CourseNotFoundException.class, () -> courseService.getCourse(999, "Raju"));
    }
}
