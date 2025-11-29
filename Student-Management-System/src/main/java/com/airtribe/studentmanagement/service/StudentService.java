package com.airtribe.studentmanagement.service;

import com.airtribe.studentmanagement.entity.Student;
import com.airtribe.studentmanagement.exception.StudentNotFoundException;
import com.airtribe.studentmanagement.interfaces.Searchable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentService implements Searchable<Student> {

    private final Map<Integer, Student> studentMap = new HashMap<>();

    public void addStudent(Student student) {
        studentMap.put(student.getId(), student);
    }

    public void getStudent(int id, String name) throws StudentNotFoundException {
        if (!studentMap.containsKey(id)) {
            throw new StudentNotFoundException("Student not found: " + id + " " + name);
        }
        studentMap.get(id);
    }

    public void getAllStudents() {
        System.out.println("All Student details are given below with student ID and Department");
        for (Student student : studentMap.values()) {
            System.out.println(String.format("Student Detail: {Student Id='%s',Student Name='%s', Student Age='%s', Department=%s}", student.getId(), student.getName(), student.getAge(), student.getDepartment()));
        }
    }

    @Override
    public List<Student> search(String query) {
        String q = query.toLowerCase();
        List<Student> result = new ArrayList<>();
        for (Student s : studentMap.values()) {
            if (s.getName().toLowerCase().contains(q)) {
                result.add(s);
            }
        }
        return result;
    }
}
