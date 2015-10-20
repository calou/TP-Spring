package com.example.spring.repository;

import java.util.List;

public interface SomeRepository {

    List<String> all();
    String get(Long id);
}
