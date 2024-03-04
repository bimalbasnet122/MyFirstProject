package Array;

import java.util.Arrays;

public class OddNumber {
	public static void main(String[] args) {
		
		int [] x = getOddNum();
		System.out.println(Arrays.toString(x));
	}
	
	static int [] getOddNum() {
		
		int[] odd= new int [50];
		
		int j=0;
		for(int i =1; i<=100; i++) {
			if (i % 2 !=0) {
				odd[j]=i;
				j++;	
			}
	
	}
		return odd;
	}
	}
