package com.example.super150_sms.repository;

import com.example.super150_sms.controller.StudentController;
import com.example.super150_sms.model.StudentModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository <StudentModel,String> {
}
