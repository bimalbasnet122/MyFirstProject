package controlstatement.selection;

import java.util.Scanner;

public class Circle {
public static void main(String[] args) {
	int r;
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter radius of circle");
	
	r=sc.nextInt();
	if(r==0) {
		System.out.println("Please do not enter zero(0)");
	}else {
	double areaOfCircle=3.14 * Math.pow(r,2);
	System.out.println("The area of circle is "+ areaOfCircle);
	}
}
}
