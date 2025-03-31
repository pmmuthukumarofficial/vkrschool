package com.example.vkrschool.service;

import java.util.List;
import java.util.Optional;

import com.example.vkrschool.model.Student;

public interface StudentService {

	List<Student> getAllStudents();
	
	
	
	Optional<Student> searchStudent(int rollno);
	
	Student addNewStudent(Student newStudent);
	
	void deleteStudent(int rollno);
	
}
