package com.poject.courseapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.poject.courseapi.model.Courses;

@Service
public class CourseServiceImpl implements CourseService {
	
	List<Courses> list;
	
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Courses(1,"Java", "Java is programming Language"));
		list.add(new Courses(2,"SpringBoot","Spring boot is a framework"));
		list.add(new Courses(3,"python","python is very very easy language"));
	}

	@Override
	public List<Courses> getCourses() {
		return list;
	}

	@Override
	public Courses getCourse(int id) {
		Courses c = null;
		for(Courses courses: list) {
			if(courses.getId()==id) {
				c=courses;
				break;}
		}
		return c;
	}
	
	public Courses addCourse(Courses course) {
		list.add(course);
		return course;
	}

}
