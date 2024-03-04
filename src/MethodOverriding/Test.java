package MethodOverriding;

public class Test {
	public static void main(String[] args) {
		//static or early binding of object
		PrabhuBank pb=new PrabhuBank();
		
		pb.getBankName();
		pb.getInterestRate();
		
		//up-casting
		CentralBank b=new NabilBank();
		b.getBankName();
		b.getInterestRate();
		
		
			
		
	}
	//late or dynamic binding of object
	//run time polymorphism
	void printBankInfo(CentralBank cb) {
		cb.getBankName();
		cb.getInterestRate();
	}

}
