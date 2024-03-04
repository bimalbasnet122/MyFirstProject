package controlstatement.selection;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		int p;
		int t;
		int r;
				
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter a principal");
		p=sc.nextInt();
		
		System.out.println("Enter a time");
		t=sc.nextInt();
		
		System.out.println("Enter a rate");
		r=sc.nextInt();
		
		if(p!=0 && t!=0 && r!=0) {
		int SI=(p*t*r)/100;
		
		System.out.println("The calculation of SI is "+ SI);
	}
	}
}
