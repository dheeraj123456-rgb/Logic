package LinkedList;

import java.util.ArrayList;

public class Demo1 {
	public static void main(String[] args) {
		
		ArrayList<String> main = new ArrayList<>();
		
		main.add("Rahul");
		main.add("Amit");
		main.add("Priya");
		
		main.set(1, "Vikash");
		main.add(1,"neha");
		
		System.out.println(main);
		System.out.println(main.get(2));
		System.out.println(main.size());
		
	}

}
