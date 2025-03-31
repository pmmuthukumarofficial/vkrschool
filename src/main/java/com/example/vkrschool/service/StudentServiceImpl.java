package com.example.vkrschool.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vkrschool.model.Student;
import com.example.vkrschool.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepo;

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepo.findAll(); 
	}

	@Override
	public Optional<Student> searchStudent(int rollno) {
		
		return studentRepo.findById(rollno); 
	}

	@Override
	public Student addNewStudent(Student newStudent) {
		
		return studentRepo.save(newStudent);
	}

	@Override
	public void deleteStudent(int rollno) {
		studentRepo.deleteById(rollno);
	}
}
