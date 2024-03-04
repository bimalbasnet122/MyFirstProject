package Constructor;

public class Triangle {
	
	int a;
	int b; 
	int c;
	
	Triangle(){
		a=3;
		b=4;
		c=5;
	}
	
	
	void printArea() {
		int s;
		int area;
		s=(a+b+c)/2;	
		area=(s-a)*(s-b)*(s-c);
		System.out.println(area);
	}
		
	


		void printPerimeter() {
			int p;
			p=a+b+c;
			System.out.println(p);
			
		}
		
		


	
	public static void main(String[] args) {
		Triangle t= new Triangle();
		
		t.printArea();
		t.printPerimeter();
		
	}
}