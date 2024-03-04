package Constructor;

public class User {
	//instance variable
	String username;
	String password;
	
	/*User(){
		username="Bimal";
		password="78945";
	}*/
	
	//this(); default constructor call
	//this(10); parameterized constructor call
	
	User(String username, String password){//local variable
		this.username= username;//instance variable call
		this.password= password;
		
		//  this.printUser(); instance methods call
		
		//this keyword=use when to identify instances if they have a same local variable name
		//=>use to represents current object.
		//=>using "this" keyword we can: 1.call instance variable 
		//								2. instance methods
		//								3. constructor
	}
	
	void printUser() {
		System.out.println("Username: "+username);
		System.out.println("Password: "+password);
	}
	
	public static void main(String[] args) {
		User u= new User("Bimal", "7894");
		u.printUser();
		
		// Object class / Root Class
		//=>implicitly inherited(automatically)
		//class Object is root of the class hierarchy
	}

}
