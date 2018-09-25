
public class LifeInsurance extends Insurance {
	
	private int age;

	
	
	public LifeInsurance(long policyNumber, String policyHolderName, int age) {
		super(policyNumber, policyHolderName);
		this.age = age;
		
	}


	@Override
	public double calculatePremium() {
		
		double premium = 0.0;
		// TODO Auto-generated method stub
		
		if(this.age < 25)
		{
			premium = 1500;
		}
		else
		{
			premium = 2000;
		}
		return premium;
	}

}
