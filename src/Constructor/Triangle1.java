package Constructor;

public class Triangle1 {
	
	int a;
	int b;
	int c;
	
	
	Triangle1(int a, int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}	
	void printArea() {	
		int s=(a+b+c)/2;
		int area=(s-a)*(s-b)*(s-c);
		System.out.println("area: "+area);
		
	}
	 void printPerimeter() {
		 int p=a+b+c;
		 System.out.println("Perimeter: "+p);


	

	}
	public static void main(String[] args) {
		
		
		Triangle1 t = new Triangle1(3,4,5);
		t.printArea();
		t.printPerimeter();
	}
}