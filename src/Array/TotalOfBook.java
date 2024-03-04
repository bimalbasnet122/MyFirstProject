package Array;

import java.util.Scanner;

public class TotalOfBook {
	public static void main(String[] args) {
		
		int price[]=new int [6];
	
	
	Scanner sc = new Scanner(System.in);
	
	for (int i=0; i<price.length; i++) {
		
		System.out.println("Enter price of book Rs. ");
		price[i]=sc.nextInt();
	}
	
		int sum=0;
	for (int x : price) {
		sum= sum+x;
		System.out.println(x);
	}
	System.out.println("price of book: "+sum);
	
	int avg=0;
	avg=sum/6;
	System.out.println("The avg="+avg);
	
	}
}
