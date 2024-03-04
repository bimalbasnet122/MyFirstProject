package Abstraction;

public class Test {
	public static void main(String[] args) {
		
		CentralBank b= new NMBBank();
		
		b.getBankName();
		b.getInterestRate();
		
		UserService us=new UserServiceImpl();
		
		us.addUser();
		us.deleteUser();
		
		us.print();
		
		UserService.updateUser();
	}

}
