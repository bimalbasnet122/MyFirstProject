package controlstatement.Looping;

public class EnhanceForLoop {
	
	/*---------Enhance for loop/forEach loop-----------------
	 * use to read data from collection(Array,List,set,map)
	 * syntax:
	 *	for(data_type var:collection){
	 *		//statement
	 *}
	 */
 public static void main(String[] args) {
	 
	int[] values= {20, 55, 99, 75};
	int sum=0;
	for(int x :values) {
		System.out.println(x);
		sum=sum+x;
	}
	System.out.println("total: "+sum);
}
}
