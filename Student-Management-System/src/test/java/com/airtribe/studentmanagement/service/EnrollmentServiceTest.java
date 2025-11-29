package com.airtribe.studentmanagement.service;

import com.airtribe.studentmanagement.entity.Course;
import com.airtribe.studentmanagement.entity.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EnrollmentServiceTest {
    private EnrollmentService enrollmentService;

    @BeforeEach
    void setup() {
        enrollmentService = new EnrollmentService();
    }

    @Test
    void addAndGetStudent() {
        Student student = new Student(1, "Rahul", 20, "CS");
        Course course = new Course(101, "Data Structures", 2);
        Double grade = 95.0;

        enrollmentService.enrollStudent(student, course, grade);
        enrollmentService.findStudentNameWithCourse(1, 101);
    }
}