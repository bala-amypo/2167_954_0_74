package com.example.demo.service;
import java.util.List;
import com.example.demo.entity.StudentEntity;
public interface StudentEntity {
    StudentEntity addStudent(StudentEntity student);
    List<StudentEntity>getAllStudents();
    StudentEntity getStudentEntityId(Long id);
    StudentEntity updateStudent(Long id,StudentEntity student);
}