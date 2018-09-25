package com.training.utils;

import java.util.*;

import com.training.entity.*;

public interface CourseDAO {

	public int addCourse(Course course);
	
	public List<Student> getStudentsBycourseName(String courseName);
	
}
