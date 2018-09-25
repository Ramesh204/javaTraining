package clsExample;

import java.util.List;

public class University {

	private String Unv_name;
	private List<Deparatment> deparatments;
	public String getUnv_name() {
		return Unv_name;
	}
	
	public void getDeptDetails(String deptNo){
		for(int i=0;i<deparatments.size();i++)
		{
			if(deptNo.equals(deparatments.get(i).getDeptNo()))
			{
				System.out.println(deparatments.get(i).getDeptName());
				System.out.println(deparatments.get(i).getDeptNo());
				System.out.println(deparatments.get(i).getAvgofDept());
				
			}
		}
	}
	
	public void setUnv_name(String unv_name) {
		Unv_name = unv_name;
	}
	public List<Deparatment> getDeparatments() {
		return deparatments;
	}
	public void setDeparatments(List<Deparatment> deparatments) {
		this.deparatments = deparatments;
	}
	public University(String unv_name, List<Deparatment> deparatments) {
		super();
		Unv_name = unv_name;
		this.deparatments = deparatments;
	}
	public University() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
