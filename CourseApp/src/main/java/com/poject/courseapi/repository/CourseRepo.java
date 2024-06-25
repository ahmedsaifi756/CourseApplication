package com.poject.courseapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poject.courseapi.model.Courses;

@Repository
public interface CourseRepo extends  JpaRepository<Courses, Integer>{

}
