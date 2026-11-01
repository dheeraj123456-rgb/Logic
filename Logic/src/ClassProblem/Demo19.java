package ClassProblem;

import java.util.Set;
import java.util.TreeSet;

public class Demo19 {
	public static void main(String[] args) {
		Set<Integer> marks = new TreeSet<>();

		marks.add(85);
		marks.add(70);
		marks.add(95);
		marks.add(85);
		marks.add(60);
		marks.add(90);

		System.out.println(marks);
		System.out.println(marks.first());
		System.out.println(marks.last());
	}

}
