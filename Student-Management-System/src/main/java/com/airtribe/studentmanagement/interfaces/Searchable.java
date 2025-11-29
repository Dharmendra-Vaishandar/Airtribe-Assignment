package com.airtribe.studentmanagement.interfaces;

import java.util.List;

public interface Searchable<T> {
    List<T> search(String query);
}
