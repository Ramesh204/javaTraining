package com.training;

import java.lang.reflect.*;
public class Application {

	public static void main(String[] args) {
		
		
		try {
			Class<?> cls= Class.forName("com.training.Movie");
			
			Movie diamond = (Movie)cls.newInstance();
			
			diamond.setMovieId(203);
			diamond.setMovieName("Titanic");
			
			System.out.println(diamond);
			
			
			Constructor<?>[] conList = cls.getDeclaredConstructors();
			
			for(Constructor<?>ctr:conList){
				System.out.println("Name  "+ctr.getName());
				System.out.println("Parm Count  "+ctr.getParameterCount());
			}
			
			Method[] methodList = cls.getDeclaredMethods();
			for(Method eachMethod:methodList){
				System.out.println(eachMethod.getName());
				System.out.println(eachMethod.getReturnType());
				Class[] types = eachMethod.getParameterTypes();
				
				for(Class eachParam:types){
					System.out.println(eachParam.getName());
				}
				
				
				
			
				
				
				
				
				
				
				
				
				
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
