package com.training.entity;

public class Course {

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + "]";
	}
	private long courseId;
	private String courseName;
	public long getCourseId() {
		return courseId;
	}
	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Course(long courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
		
	
	
}
