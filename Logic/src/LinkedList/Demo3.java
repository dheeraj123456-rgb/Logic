package LinkedList;

import java.util.ArrayList;

public class Demo3 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();

		names.add("Java");
		names.add("Python");
		names.add("Java");
		names.add("React");

		names.remove("Java");
		
		System.out.println(names);
		System.out.println(names.indexOf("Java"));
		System.out.println(names.lastIndexOf("Java"));
	}

}
