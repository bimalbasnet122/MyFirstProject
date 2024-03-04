package JavaCollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
	
	public static void main(String[] args) {
		
		//subject  marks
		
		//Map<String, Integer> map = new HashMap<>();
		//Map<String, Integer> map = new TreeMap<>();
		Map<String, Integer> map = new LinkedHashMap<>();
		
		map.put("nepali", 85);
		map.put("math", 90);
		map.put("computer", 92);
		map.put("english", 88);
		
		
		for (String key : map.keySet()) {
			System.out.println(key+"="+map.get(key));
	}

}
}