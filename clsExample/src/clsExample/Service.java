package clsExample;

import java.util.*;

public class Service {

	private University unv;
	
	public void getDetailsOfDeptNo(String no)
	{
		unv.getDeptDetails(no);
	}
	public int[] getMarks(){
		int[] val = new int[3];
		for(int i=0; i<3;i++)
		{
			val[i]=(int) (Math.random()*100);
		}
		return val;
	}
	public void studDetails(){
		student stud1 = new student("harshit", 214,getMarks());
		student stud2 = new student("Ram", 218,getMarks());
		student stud3 = new student("Shyam", 224,getMarks());
		student stud4 = new student("Mahesh", 244,getMarks());
		student stud5 = new student("Suresh", 248,getMarks());
		student stud6 = new student("Rajesh", 288,getMarks());
		
		List<student> s1= new ArrayList<student>();
		s1.add(stud1);
		s1.add(stud2);
		
		List<student> s2= new ArrayList<student>();
		s2.add(stud3);
		s2.add(stud4);
		
		List<student> s3= new ArrayList<student>();
		s3.add(stud5);
		s3.add(stud6);
		
		
		Deparatment dept1 = new Deparatment("ECE", "101A",s1);
		Deparatment dept2 = new Deparatment("CSE", "102A",s2);
		Deparatment dept3 = new Deparatment("MECH", "103A",s3);
		
		
		List<Deparatment> dept = new ArrayList<>();
		dept.add(dept1);
		dept.add(dept2);
		dept.add(dept3);
		
		 unv = new University("RockFord",dept);
		
 		
		
	}
}
