package com.klef.jfsd.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.springboot.model.Student;
import com.klef.jfsd.springboot.service.StudentService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("student")
public class StudentController 
{
	@Autowired
	private StudentService servive;
	
	@GetMapping("/")
	public String home(){
		return "Rest API with JPA";
	}
	
	@PostMapping("add")
	public String addstudent(@RequestBody   Student student) {
		return servive.addstudent(student);
		
	}
	
	@GetMapping("viewall")
	public List<Student> viewallStudent()
	{
		return servive.displayallStudents();
	}
	
	@GetMapping("display")
	public Student displaystudentbyid(@RequestParam("id")  int sid)
	{
		return servive.displayStudentByID(sid);
	}
	
	@DeleteMapping("delete")
	public String deletestudent(@RequestParam("id")  int sid)
	{
		return servive.deletestudent(sid);
	}
	

	@PutMapping("update")
	public String updatestudent(@RequestBody  Student s)
	{
		return servive.updatestudent(s);
	}


	
	
	
	

}
