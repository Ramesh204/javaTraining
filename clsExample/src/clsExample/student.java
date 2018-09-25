package clsExample;

public class student {

	private String studName;
	private long rollNo;
	private int[] mark;
	
	public double getAvg(){
		double avg=0.0;
		for(int i=0;i<mark.length;i++)
		{
			
			avg+=mark[i];
			  
		}
		 return avg = avg/mark.length;
		
	}
	
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public long getRollNo() {
		return rollNo;
	}
	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}
	public int[] getmark() {
		return mark;
	}
	public void setmark(int[] mark) {
		this.mark = mark;
	}
	public student(String studName, long rollNo, int[] mark) {
		super();
		this.studName = studName;
		this.rollNo = rollNo;
		this.mark = mark;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
