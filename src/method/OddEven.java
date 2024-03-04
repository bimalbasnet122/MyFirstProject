package method;

import java.util.Scanner;

public class OddEven {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n= sc.nextInt();
		
		evenOdd(n);
		
		
		
		
		
		
	}
  static void evenOdd(int num) {
	  if (num%2==0) {
		  System.out.println("The num is even");
	  }else {
		  System.out.println("The num is odd");
	  }
	  
  }
  
  
  
  }

