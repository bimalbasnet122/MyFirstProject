package JavaCollection;

import java.util.ArrayList;
import java.util.List;

public class StudentRunner {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setFullName("Bimal Basnet");
		s1.setAge(25);
		s1.setId(789);
		s1.setAddress("BKT");
		
		List<Student> list = new ArrayList<>();
		
		list.add(s1);
		
		for (Student s : list) {
			System.out.println(s);
		}
		
		

	}

}
