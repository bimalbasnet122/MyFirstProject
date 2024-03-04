package JavaCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	
	public static void main(String[] args) {
		
		//List<String> list = new ArrayList<>();
		
		List<String> list = new LinkedList<>();
		
		/*
		 * Student s1=new Student()	;
		 * s1.set...
		 * ......
		 * list.add(s1)
		 * 	 */
		
		list.add("nepal");
		list.add("bhutan");
		list.add("china");
		list.add("korea");
		list.add("canada");
		
		list.remove(2);
		list.remove("china");
		
		System.out.println(list.contains("india"));
		System.out.println(list.contains("canada"));
		
		//list.clear();
		
		
		for(String s : list) {
			System.out.println(s);
	}
}
}

//list of student
//list of book