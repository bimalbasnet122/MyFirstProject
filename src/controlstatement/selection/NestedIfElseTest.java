package controlstatement.selection;

import java.util.Scanner;

public class NestedIfElseTest {
	
	/*-------Nested if-else-------------
	 * syntax: 
	 * 	if(condition1){
	 * 		if(condition2){
	 * 			if(condition3){
	 * 			................
	 * 			................
	 * 	}else{	
	 * }
	 */
	
	public static void main(String[] args) {
		String citizen;
		int age;
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter your citizenship");
		citizen= sc.next();
		
		System.out.println("Enter your age");
		age=sc.nextInt();
		

		
		if(citizen.equals("Nepali")) {
			if(age>=18) {
				System.out.println("You can vote");
			}else {
				System.out.println("You are under age"); 
			}
			
		}else {
			System.out.println("Invalid Citizenship");
		
	}
	}

}
