package Array;

import java.util.Arrays;

public class ArrayWithMethod {
	/*-------------
	 *              Array with Method ------------------
	 * 		a. array as argument
	 * 				void sum (int a[]){
	 * 				   }
	 * 
	 *      b. array as return type
	 *      		int[] getValue(){
	 *      
	 *              //array = 90, 4, 85, 75, 96
	 *              return array;
	 * 
	 * 			}
	 */
	public static void main(String[] args) {
		
		int values[]= {45,54,54,54,54,54,54,8,48};
		sum(values);
		
		int [] x= get5IntValue();
		System.out.println(Arrays.toString(x));
	}
	
		//array as argument
	
		static void sum (int data[]) {
			
			int s= 0;
			for (int x : data){
				s= s+x;	
			}
			System.out.println("total="+s);
		
		}
		
		
		//array as return type
		
		static int[] get5IntValue() {
			
			int [] values= {5,8,7,3,4};
			return values;
		}
}


