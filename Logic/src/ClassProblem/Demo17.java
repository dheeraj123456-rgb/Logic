package ClassProblem;

import java.util.HashSet;
import java.util.Set;

public class Demo17 {
	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<>();

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);

		numbers.add(null);
		numbers.add(null);

		System.out.println(numbers.size());
		System.out.println(numbers.contains(null));
	}

}
