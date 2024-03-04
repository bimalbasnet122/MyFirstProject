package Encapsulation;

public class CustomerRunner {

	public static void main(String[] args) {
		Customer c= new Customer();
		
		c.setId(23);
		c.setName("Jack");
		c.setAge(25);
		c.setCity("KTM");
		
		//System.out.println("Id = "+c.getId());
		//System.out.println("Name = "+c.getName());
		//System.out.println("Age = "+c.getAge());
		//System.out.println("City = "+c.getCity());
		
		System.out.println(c);
		

	}

}
