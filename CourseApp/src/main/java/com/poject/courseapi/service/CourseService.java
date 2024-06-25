package com.poject.courseapi.service;

import java.util.List;

import com.poject.courseapi.model.Courses;

public interface CourseService {
	public List<Courses> getCourses();
	
	public Courses getCourse(int id);
	
	public Courses addCourse(Courses course);
}
