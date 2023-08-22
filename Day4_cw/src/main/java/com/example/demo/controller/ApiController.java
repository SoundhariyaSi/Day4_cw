package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.ApiService;

@RestController
public class ApiController {
     
	@Autowired// 
	ApiService asi;
	
	@PostMapping("addstudent")
	public Student add(@RequestBody Student ss)
	{
		return asi.saveinfo(ss);
	}

	@PostMapping("addnstudent")
	public List<Student> addndetails(@RequestBody List<Student> ss)
	{
		return asi.savedetails(ss);
	}
	
    
	@GetMapping("showdetails")
   public List<Student> show()
   {
	   return asi.showinfo();
   }
	
	@PutMapping("update")
	public Student modify(@RequestBody Student ss)
	{
		return asi.changeinfo(ss);
	}
	
	@DeleteMapping("deletedet")
	public String del(@RequestBody Student ss )
	{
		asi.deleteinfo(ss);
		return "Deleted succesfully";
	}
	
}