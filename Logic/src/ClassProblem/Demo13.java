package ClassProblem;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Demo13 {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		
		map.put("Mp","Madhya pradesh");
		map.put("Br", "Bihar");
		map.put("Jh", "Jharkhand");
		map.put("UP", "Lucknow");
		map.put("RJ", "Jaipur");
		map.put("GJ", "Gandhinagar");
		map.put("MH", "Mumbai");
		map.put("GA", "Panaji");
		map.put("AS", "Dispur");
		
		System.out.println(map.containsKey("MH"));
		
		for(Entry<String,String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" -> "+entry.getValue());
		}
	}

}
