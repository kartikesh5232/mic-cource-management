package com.example.miccourcemanagement.service;

import com.example.miccourcemanagement.model.Course;
import com.example.miccourcemanagement.model.Transaction;

import java.util.List;

public interface CourseService {
    List<Course> allCourses();
    Course findCourseById(Long courseId);
    List<Transaction> findTransactionsOfUser(Long userId);
    List<Transaction> findTransactionsOfCourse(Long courseId);
    Transaction saveTransaction(Transaction transaction);
}
