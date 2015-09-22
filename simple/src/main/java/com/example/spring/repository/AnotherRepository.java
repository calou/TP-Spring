package com.example.spring.repository;

import java.util.List;

public interface AnotherRepository {

    List<String> all();
    String get(Long id);
}
