package method;

import java.util.Scanner;

public class Largest {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Enter 1st number");
		int n1=sc.nextInt();
		
		System.out.println("Enter 2nd number");
		int n2= sc.nextInt();
		
		System.out.println("Enter 3rd number");
		int n3=sc.nextInt();
		
		largest(n1, n2, n3);
	}
	static void largest(int n1, int n2, int n3) {
		  if (n1>=n2 && n1>=n3) {
			  System.out.println("Largest=" + n1);
			  
		  }else if (n2>=n1 && n2>=n3) {
			  System.out.println("Largest="+ n2);
		  }else {
			  System.out.println("Largest="+ n3);
		  }
}
}