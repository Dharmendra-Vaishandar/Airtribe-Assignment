package com.airtribe.studentmanagement.service;

import com.airtribe.studentmanagement.entity.Course;
import com.airtribe.studentmanagement.entity.Enrollment;
import com.airtribe.studentmanagement.entity.Student;
import com.airtribe.studentmanagement.interfaces.Gradeable;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentService implements Gradeable<Student> {
    private final List<Enrollment> enrollments = new ArrayList<>();

    public void enrollStudent(Student student, Course course, Double grade) {
        enrollments.add(new Enrollment(student, course, grade));
    }

    public List<String> findStudentNameWithCourse(int studentId, int courseId) {
        List<String> result = new ArrayList<>();
        for (Enrollment e : enrollments) {
            if (e.getStudentId().getId() == studentId && e.getCourseId().getCourseId() == courseId) {
                result.add(e.getStudentId().getName() + " with " + e.getCourseId().getCourseName());
            }
        }
        return result;
    }

    public List<Enrollment> getAll() {
        return new ArrayList<>(enrollments);
    }

    @Override
    public List<String> grade(String studentName) {
        List<String> result = new ArrayList<>();
        for (Enrollment e : enrollments) {
            if (e.getStudentId().getName().equals(studentName)) {
                result.add(e.getStudentId().getName() + " secured " + " has grade " + e.getGrade());
            }
        }
        return result;
    }

}


