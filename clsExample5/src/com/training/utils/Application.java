package com.training.utils;

import com.training.entity.*;
import com.training.entity.Student;

public class Application {

	public static void main(String[] args) {
		
//		Course course1 = new Course(101,"Java");
//		Course course2 = new Course(102,"DotNet");
//		
//		Student student1 = new Student(14204,"Ramesh",101);
		
//		Student student2 = new Student(14205,"Suresh",101);
//		Student student3 = new Student(14206,"Mahesh",102);
//		Student student4 = new Student(14207,"Vignesh",102);
//	
		CourseDAO cdao = new CourseDAOImpl();
		
//		cdao.addCourse(course1);
//		cdao.addCourse(course2);
		
		
	StudentDAO sdao = new StudentDAOImpl();
		
//		sdao.addStudent(student1);
		
		
//		sdao.addStudent(student2);
//		sdao.addStudent(student3);
//		sdao.addStudent(student4);
//		
		
		
		
		
	System.out.println(cdao.getStudentsBycourseName("DotNet"));
		
		

	}

}
