
public class VehicleInsurance extends Insurance {

	private String vehicleType;
	private int yearOfManufacture;
	
	
	

	public VehicleInsurance(long policyNumber, String policyHolderName, String vehicleType, int yearOfManufacture) {
		super(policyNumber, policyHolderName);
		this.vehicleType = vehicleType;
		this.yearOfManufacture = yearOfManufacture;
	}




	@Override
	public double calculatePremium() {
		// TODO Auto-generated method stub
		
		double premium = 0.0;
		
		if(this.vehicleType.equals("bike")){
			switch(this.yearOfManufacture){
			case 2017:
				premium =200;
				break;
			case 2018:
				premium = 300;
				break;
			default:
				premium = 1400;
			}
		}
		else
		{
			switch(this.yearOfManufacture){
			case 2016:
				premium =200;
				break;
			case 2015:
				premium = 300;
				break;
			default:
				premium = 1400;
			}
		}
		return premium;
	}

}
