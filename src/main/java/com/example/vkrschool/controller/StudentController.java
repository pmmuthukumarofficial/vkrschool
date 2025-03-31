package com.example.vkrschool.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.vkrschool.model.Student;
import com.example.vkrschool.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/api/students")
	public List<Student> apiForGetAllData()
	{
		return studentService.getAllStudents();
	}
	
	@GetMapping("/api/students/{id}")
	public Optional<Student> apiForSearchData(@PathVariable("id") int rollno)
	{
		return studentService.searchStudent(rollno);
	}
	
	@PostMapping("/api/student")
	public Student apiForAddData(@RequestBody Student student)
	{
		Optional<Student> opt=studentService.searchStudent(student.getRollno());
		if(opt.isEmpty())
			return studentService.addNewStudent(student);
		else
			return new Student();
		
	}
	
	@PutMapping("/api/student")
	public Student apiForUpdateData(@RequestBody Student student)
	{
		Optional<Student> opt=studentService.searchStudent(student.getRollno());
		if(opt.isPresent())
			return studentService.addNewStudent(student);
		else 
			return new Student();
				
	}
	
	@DeleteMapping("/api/students/{id}")
	public Optional<Student> apiForDeleteData(@PathVariable("id") int rollno)
	{
		Optional<Student> opt=studentService.searchStudent(rollno);
		if(opt.isPresent())
		{
			studentService.deleteStudent(rollno);
			return opt;
		}
		else
			return opt;
	}
	
}






