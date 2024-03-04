package controlstatement.selection;

import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		
		String post;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your post:MD, CEO, MANAGER or HEPLER");
		post=sc.next();
		
		switch(post) {
		case "MD":
			int salary=230000;
			int bonus=230000*20/100;
			int totalSalary=salary+bonus;
			System.out.println("The salary of MD is Rs.230000 and with 20% bonus is Rs. "+ totalSalary);
			break;
			
		case "CEO":
			salary=250000;
			double bonus1=250000*25.79/100;
			double totalSalary1=salary+bonus1;
			System.out.println("The salary of CEO is Rs.250000 and with 25.79% bonus is Rs. "+ totalSalary1);
			break;
			
		case "MANAGER":
			salary=176000;
			bonus=176000*16/100;
			totalSalary=salary+bonus;
			System.out.println("The salary of Manager is Rs.176000 and with 16% bonus is Rs. "+ totalSalary);
			break;
			
		case "HELPER":
			salary=145900;
			bonus=145900*9/100;
			totalSalary=salary+bonus;
			System.out.println("The salary of Manager is Rs.145900 and with 9% bonus is Rs. "+ totalSalary);
			break;
			
		default:
			System.out.println("Invalid Enteries");
			
			
			
		}
		
		
	}

}
