package controlstatement.Looping;

public class WhileTest {
	
	/* __-------while loop------------
	 * syntax:
	 * 		while(condition){
	 * 		//statement
	 * 		//inc/dec
	 * }
	 */
	public static void main(String[] args) {
		
		int n=5;
		int fact=1;
		
		while(n>1) {
			fact=fact*n;
			n--;
		}
		System.out.println("Result: "+fact);
	}
}
