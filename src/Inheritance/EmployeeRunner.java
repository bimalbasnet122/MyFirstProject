package Inheritance;

public class EmployeeRunner {
	
	public static void main(String[] args) {
		
		Programmer p= new Programmer();
		p.id=428;
		p.fname="Rohit";
		p.lname="Sharma";
		p.salary=150000;
		p.bonus=20000;
		p.progLang="Java";
		p.project="CMS";
		
		p.print();
		
		
	}

}
