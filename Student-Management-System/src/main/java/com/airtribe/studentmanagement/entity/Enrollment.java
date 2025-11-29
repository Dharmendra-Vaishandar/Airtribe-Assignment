package com.airtribe.studentmanagement.entity;

import com.airtribe.studentmanagement.util.DateUtil;

public class Enrollment {
    private final Student student;
    private final Course course;
    private final Double grade;

    public Enrollment(Student student, Course course, Double grade) {
        this.student = student;
        this.course = course;
        this.grade = grade;
    }

    public Student getStudentId() {
        return student;
    }

    public Course getCourseId() {
        return course;
    }

    public Double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return String.format("Enrolled Students: {studentId='%s', courseId='%s', grade=%s, date=%s}", student, course, grade, DateUtil.today());
    }
}
