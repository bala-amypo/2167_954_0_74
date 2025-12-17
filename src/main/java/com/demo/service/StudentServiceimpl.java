package com.example.demo.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    private final Map<Long, StudentEntity> store = new HashMap<>();
    private Long counter = 1L;

    @Override
    public StudentEntity insertStudent(StudentEntity st) {
        st.setId(counter++);
        store.put(st.getId(), st);
        return st;
    }

    @Override
    public List<StudentEntity> getAllStudent() {
        return new ArrayList<>(store.values());
    }

    @Override
    public Optional<StudentEntity> getOneStudent(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public void deleteStudent(Long id) {
        store.remove(id);
    }
}
