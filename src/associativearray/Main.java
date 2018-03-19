package associativearray;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Banana", 23);
		map.put("Value", 200);
		map.put("Tomato", 52);
		map.put("Hello", 123);
		
		for(Map.Entry<String, Integer> entry: map.entrySet()) 
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		
		map.keySet().forEach(k -> System.out.printf("Key is: %s%n", k));
		map.values().forEach(v -> System.out.printf("Value is: %s%n", v));
	}

}
