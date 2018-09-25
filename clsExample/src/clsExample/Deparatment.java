package clsExample;

import java.util.ArrayList;
import java.util.List;

public class Deparatment {

	private String deptName;
	private String deptNo;
	private List<student> students;
	
	
	public double getAvgofDept(){
		double avg=0.0;
		for(int i=0;i<students.size();i++)
		{
			
			avg+=students.get(i).getAvg();
			  
		}
		 return avg = avg/students.size();
		
	}
	
	public String getDeptName() {
		return deptName;
	}
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	public List<student> getStudents() {
		return students;
	}
	public void setStudents(List<student> students) {
		this.students = students;
	}
	public Deparatment(String deptName, String deptNo, List<student> students) {
		super();
		this.deptName = deptName;
		this.deptNo = deptNo;
		this.students = students;
	}
	public Deparatment() {
		super();
		// TODO Auto-generated constructor stub
		students = new ArrayList<student>();
	}
	
}
