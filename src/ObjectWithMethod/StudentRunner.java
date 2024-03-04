package ObjectWithMethod;

public class StudentRunner {

	public static void main(String[] args) {
		
		Student s =new Student();
		s.setLname("Sharma");
		s.setId(7894);
		s.setFname("Rohit");
		s.setRollno(428);
		s.setCollege("NCC");	
		
		StudentRunner sr= new StudentRunner();
		Student st= sr.getStudentData();

		sr.printStudent(st);
	}
	//1.object as parameter
	
	void printStudent(Student s) {
		System.out.println("Id="+s.getId());
		System.out.println("First Name="+s.getFname());
		System.out.println("Last Name="+s.getLname());
		System.out.println("Roll No="+s.getRollno());
		System.out.println("College="+s.getCollege());
		
		
		
	}
	
	//2.object as return type
	
	Student getStudentData() {
		
		Student s =new Student();
		s.setLname("Sharma");
		s.setId(7894);
		s.setFname("Rohit");
		s.setRollno(428);
		s.setCollege("NCC");	
		
		return s;
	}
}
