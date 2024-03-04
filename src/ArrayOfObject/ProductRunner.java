package ArrayOfObject;

import java.util.Scanner;

public class ProductRunner {
	public static void main(String[] args) {
		
		//store and print data of 5 products
		
		//create array of product
		Project projects[]=new Project[5];
		
		//write data in array
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<projects.length;i++ ) {
			
		Project p= new Project();
		
		System.out.println("Enter Id");
		p.setId(sc.nextInt());
		
		System.out.println("Enter name");
		p.setName(sc.next());
		
		System.out.println("Enter price");
		p.setPrice(sc.nextInt());
		
		System.out.println("Enter company's name");
		p.setCompany(sc.next());	
		
		projects[i]=p;
		}
		//read data from array
		
		int tp=0;
		for (Project pd : projects) {
			System.out.println(pd);
			
			if(pd.getCompany().equals("CG")) {
			tp=tp+pd.getPrice();
		}
		
		}
		System.out.println("Total Price: "+tp);
		
		
	}

}
