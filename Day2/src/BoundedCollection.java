import java.util.*;
public class BoundedCollection {

	public static void display(List<? extends Insurance> Insurance){
		
		System.out.println(Insurance.get(0).calculatePremium());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LifeInsurance rakesh = new LifeInsurance(13952689,"Rakesh",14);
		
		List<LifeInsurance> life = new ArrayList<>();
		life.add(rakesh);
		display(life);
		
		
		VehicleInsurance marutiCar = new VehicleInsurance(202,"Suresh","Car",100);
		
		List<VehicleInsurance> vehicle = new  ArrayList<>();
		
		vehicle.add(marutiCar);
		
		display(vehicle);
	}

}
