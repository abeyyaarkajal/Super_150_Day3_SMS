package com.example.super150_sms.service;

import com.example.super150_sms.model.StudentModel;
import com.example.super150_sms.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private StudentRepository repository;
    public StudentService(StudentRepository repository) {
    this.repository = repository;
    }

    //create
    public StudentModel addStudent(StudentModel student){
        return repository.save(student);
    }
}
