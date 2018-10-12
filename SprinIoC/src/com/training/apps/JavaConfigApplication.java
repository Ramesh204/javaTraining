package com.training.apps;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.beans.AppContext;
import com.training.beans.Teacher;

public class JavaConfigApplication {

	public static void main(String[] args) {
		
		BeanFactory ctx = new AnnotationConfigApplicationContext(AppContext.class);
//		
//		Teacher teacher = ctx.getBean(Teacher.class);
//		
//		System.out.println(teacher);

		
		Teacher teacher = ctx.getBean("teacher",Teacher.class);
		System.out.println(teacher);
		

	}

}
