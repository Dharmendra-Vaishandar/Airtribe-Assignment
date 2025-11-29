package com.airtribe.studentmanagement.service;

import com.airtribe.studentmanagement.entity.Student;
import com.airtribe.studentmanagement.exception.StudentNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class StudentServiceTest {
    private StudentService studentService;

    @BeforeEach
    void setup() {
        studentService = new StudentService();
    }

    @Test
    void addAndGetStudent() throws StudentNotFoundException {
        Student s = new Student(1, "Rahul", 20, "CS");
        studentService.addStudent(s);
        studentService.getStudent(1, "Rahul");
    }
    @Test
    void getStudentNotFound() {
        assertThrows(StudentNotFoundException.class, () -> studentService.getStudent(999, "Raju"));
    }
}