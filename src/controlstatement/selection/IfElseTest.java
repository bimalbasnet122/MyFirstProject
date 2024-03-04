package controlstatement.selection;

import java.util.Scanner;

public class IfElseTest {
	
	/*-----------------if-else----------------------
	 * use to implement 

	 * syntax: if(condition){
	 * 			statement
	 * }else{
	 * 			statement
	 * }
	 * 
	 */
	public static void main(String[] args) {
		int n=50;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("E");
		if(n % 2 ==0) {
			System.out.println("The entered number is even");
		}else {
			System.out.println("The entered number is odd");
		}
		
	}

}
