package controlstatement.selection;

import java.util.Scanner;

public class SwitchTest {
	
	/*-------------switch------------
	 * syntax :
	 * switch (variable){
	 *  	case 1 :
	 *  	//statement
	 *  	break;
	 *  ......................
	 *  ......................
	 *  	case 100 :
	 *  	//statement
	 *  	break;
	 *  ......................
	 *  ......................
	 *  
	 * 		default :
	 * 		//statement
	 */
	public static void main(String[] args) {
		int day;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a day is number");
		day=sc.nextInt();
		
		switch(day) {
		case 1 :
			System.out.println("Sunday");
			break;
		case 2 :
			System.out.println("Mon");
			break;	
		case 3 :
			System.out.println("Tues");
			break;
		case 4 :
			System.out.println("Wed");
			break;
		case 5 :
			System.out.println("Thu");
				break;
		case 6 :
			System.out.println("Fri");
				break;
		case 7 :
			System.out.println("Sat");
				break;
		default :
			System.out.println("Invalid Enteries");
		
		}
	}
}
