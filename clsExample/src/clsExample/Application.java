package clsExample;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter dept No");
		Scanner sc= new Scanner(System.in);
		
		Service service = new Service();
		
		String deptno = sc.next();
		
		service.getDetailsOfDeptNo(deptno);
	}

}
