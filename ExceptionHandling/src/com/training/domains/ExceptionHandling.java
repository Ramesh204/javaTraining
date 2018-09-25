package com.training.domains;

public class ExceptionHandling {

	public static String catchWithJava8(){
		try{
			String args= "5";
			int age= Integer.parseInt(args);
			
			int markscored = 450;
			
			int average = markscored/0;
			
			System.out.println(age);
			
			System.out.println(average);
		}
		catch(ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException  e)
		{
			System.err.println("Requires command line Arrgs ,did u pass the same");
			System.err.println(e.getClass());
			return "bye  bye";
		}
		
		finally{
			System.out.println("Inside Finally");
		}
		System.out.println("done");
		
		return "ByE";
	}
	
	
	
	public static String handle(){
		try{
			String args= "5";
			int age= Integer.parseInt(args);
			
			int markscored = 450;
			
			int average = markscored/0;
			
			System.out.println(age);
			
			System.out.println(average);
		}
		catch(ArrayIndexOutOfBoundsException  e)
		{
			System.err.println("Requires command line Arrgs ,did u pass the same");
		}
		catch(NumberFormatException e){
			System.err.println("command line should be pos number");
		}
		catch(ArithmeticException e)
		{
			
			System.err.println("Denominator shouldn't be ZERO");
			return "bye bye";
		}
		finally{
			System.out.println("Inside Finally");
		}
		System.out.println("done");
		
		return "ByE";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		handle();
		catchWithJava8();
	}

	
}
