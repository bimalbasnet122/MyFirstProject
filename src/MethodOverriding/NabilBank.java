package MethodOverriding;

public class NabilBank extends CentralBank {
	
	@Override
	void getBankName() {
		System.out.println("Nabil Bank");
		
	}
	@Override
	void getInterestRate() {
		System.out.println("13%");
	}
}
