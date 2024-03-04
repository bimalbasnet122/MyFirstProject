package controlstatement.selection;

import java.util.Scanner;

public class RupeeConveter {

	public static void main(String[] args) {
		int rupees;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a rupees Rs.");
		
		rupees=sc.nextInt();
		
		if(rupees==0) {
			System.out.println("Plz enter a rupees more than zero. Thank you!!");
		}else {
		double USDollor=rupees*0.0076;
		System.out.println("The converted form of " + "Rs." +rupees + " to US dollor is: $"+USDollor);
		}
		
		

	}

}
