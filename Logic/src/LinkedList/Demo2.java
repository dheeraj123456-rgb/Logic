package LinkedList;

import java.util.ArrayList;

public class Demo2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		
		list.remove(Integer.valueOf(15));
		list.add(2,100);
		
		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println(list.size());
	}

}
