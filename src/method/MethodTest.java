package method;

public class MethodTest {

	public static void main(String[] args) {
		
		sum();
		printArea(5,4);
		oddEven(5);
		
		int a=getSunOf1to100();
		System.out.println("Total="+a);
		
		int sv=findSmallest(5, 7);
		System.out.println("Smallest="+sv);
		
		int rectangle=getArea(40,50);
	//	System.out.println("The area of rectangle="+rectangle);
		
		volume(rectangle, 6);
		
	}
	//1. no return type with no argument
	
	static void sum() {
		int a=500;
		int b=800;
		
		int c=a+b;
		
		System.out.println("Sum="+c);
	}
	
	//2.no return type with argument
	
	static void printArea(int l, int b) {
		int c=l*b;
		System.out.println("Area="+c);
				
	}
	
	static void oddEven(int i) {
		if(i%2==0) {
			System.out.println("The number is Even");
		}else{
				System.out.println("The number is Odd");
			}
		}
	
		//3. return type without argument
	static int getSunOf1to100() {
		int s=0;
		for (int i=1; i<=100; i++) {
			//System.out.println(i);
			s=s+i;
		}
	return s;
	}
	
	
		//4. return type with argument
	
		static int findSmallest(int x, int y) {
			if (x<y) {
				return x;
			}
			return y;
		}
	
	static int getArea(int l, int b) {
		
		int area=l*b;
		
		return area;
	}
	
	static void volume(int area, int h) {
		int vol=area * h;
		System.out.println("Area ="+ area);
		System.out.println("Volume"+ vol);
		
	}
	
}
