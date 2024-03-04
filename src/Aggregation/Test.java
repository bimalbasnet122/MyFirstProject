package Aggregation;

public class Test {
	public static void main(String[] args) {
		Car c= new Car();
		
		c.setColor("Black");
		c.setModel("MT800");
		c.setCc(1200);
		
		Employee e= new Employee();
		e.setId(45);
		e.setName("Ram");
		e.setSalary(50000);
		e.setCompany("Google");
		e.setCar(c);
		
		System.out.println("id="+e.getId());
		System.out.println("Name="+e.getName());
		System.out.println("Salary="+e.getSalary());
		
		System.out.println("----------CAR INFO----------");
		System.out.println("Color="+e.getCar().getColor());
		System.out.println("Model="+e.getCar().getModel());
		System.out.println("CC="+e.getCar().getCc());
	}

}
