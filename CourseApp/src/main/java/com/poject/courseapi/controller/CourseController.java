package com.poject.courseapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poject.courseapi.model.Courses;
import com.poject.courseapi.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	

	@GetMapping("/home")
	public String home() {
		return "Assalamualaikum";
	}
	@GetMapping("/bad")
	public String bad() {
		return "Walaikum";
	}
	
	@GetMapping("/courses")
	public List<Courses> getAllCourses (){
		return courseService.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Courses getCoursesById(@PathVariable String courseId) {
		return courseService.getCourse(Integer.parseInt(courseId));
	}
	
	@RequestMapping("/courses")
	public Courses addCourse(@RequestBody Courses course) {
		return courseService.addCourse(course);		
	}
}
