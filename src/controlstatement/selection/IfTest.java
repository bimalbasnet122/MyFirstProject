package controlstatement.selection;

import java.util.Scanner;

public class IfTest {
	
	/*---------------if-------------
	 * use to implement single condition
	 * 
	 * 	syntax:
	 * 		if(condition){
	 *		statement

	 * 		}
	 */
	public static void main(String[] args) {
		int salary;
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter a salary amount");
		salary=sc.nextInt();
		
		if (salary<30000) {
		salary=salary+8000;
		}
		System.out.println("Your total salary is "+ salary);
		
	}
	
}
