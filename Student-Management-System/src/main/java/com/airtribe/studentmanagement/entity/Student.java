package com.airtribe.studentmanagement.entity;

public class Student extends Person {
    private final String department;

    public Student(int id, String name, int age, String department) {
        super(id, name, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
