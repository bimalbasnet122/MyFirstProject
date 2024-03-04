package method;

import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter your age");
	int a=sc.nextInt();
	
	age(a);

}
	static void age(int a) {
		  if (a>=18) {
			  System.out.println("Eligible to voting");
		  }else {
			  System.out.println("Not eligible to vore");
		  }
	  }
}