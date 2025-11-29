package com.airtribe.studentmanagement.interfaces;

import java.util.List;

public interface Gradeable<T> {
    List<String> grade(String studentName);
}
