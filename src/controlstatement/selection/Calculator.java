package controlstatement.selection;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number");
		num1=sc.nextInt();
		
		System.out.println("Enter second number");
		num2=sc.nextInt();
		
		char op;
		System.out.println("Select one of operator: +, -, *, or /");
		op=sc.next().charAt(0);
		
		switch(op) {
		case '+':
			System.out.println("Add: "+ (num1+num2));
			break;
		case '-':
			System.out.println("Subtract: "+ (num1-num2));
			break;
		case '*':
			System.out.println("Multiple: "+ (num1*num2));
			break;
		case '/':
			System.out.println("Divide: "+ (num1/num2));
			break;
		default:
		System.out.println("Invalid operator");
		}
	}

}
