package com.example.vkrschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vkrschool.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
