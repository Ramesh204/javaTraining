
public class InsuranceAgent {
	
	//parameter passing of superType can pass  subclassType
	public static void findPremium(Insurance Insurance){
		System.out.println(Insurance.calculatePremium());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		VehicleInsurance pulasrBike = new VehicleInsurance(393939,"Ramesh","bike",2017);
		
		findPremium(pulasrBike);
		
		//superClassType = subClasstype 
		Insurance maruticar = new VehicleInsurance(4949229,"Suresh","car",2017);
		
		findPremium(maruticar);
		
		Insurance ramesh = new LifeInsurance(366963,"ramesh",20);
		
		findPremium(ramesh);
		
		LifeInsurance john = new LifeInsurance(352689,"john",30);
		
		findPremium(john);
	}

}
