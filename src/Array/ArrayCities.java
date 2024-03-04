package Array;

import java.util.Arrays;

public class ArrayCities {
	public static void main(String[] args) {
		String [] values = {"bkt", "ktm", "lit", "pok"};
		cities(values);
		
		String [] x =get7States();
		System.out.println(Arrays.toString(x));
	}
	
	static void cities(String[] data) {
		
		for (String x: data) {
			System.out.println(x);
		}
	}
	
	
	static String [] get7States() {
		String [] states= {"koshi","madhesh","bagmati","gandaki","lumbini","karnali","sudurpashchim"};
		return states;
	}
}
