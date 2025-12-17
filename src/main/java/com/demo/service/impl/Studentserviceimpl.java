package com.example.demo.service.impl;
import java.util.*;
import org.springframework.stereotype.service;
import com.example.demo.entity.student;
@service
public class StudentServiceImpl implements StudentService{
    private final Map<Long,Student>store=new HashMap<>();
    private Long counter=1;
    @Override
    public Student insertStudent(Student st){
        st.setId(counter++);
        store.put(st.getId(),st);
        return st;
        
    }
    @Override
    public Optional<Student>getOneStudent(Long id)

}