package controlstatement.Looping;

public class DoWhileTest {
	/*
	 * syntax: 
	 * 		do{
	 * 			
	 * 			//statement
	 * 			//inc/dec
	 * 
	 * 		}while(condition);
	 */
	public static void main(String[] args) {
		int n=23;
		int i=1;
		
		do {
			System.out.println(n+" X "+ i + " = " + (n*i));
			i++;
		}while(i<=10);
	}
}
