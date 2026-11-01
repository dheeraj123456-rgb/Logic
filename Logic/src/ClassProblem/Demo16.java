package ClassProblem;

import java.util.HashSet;
import java.util.Set;

//A developer wants to remove all elements from one HashSet that are also present in another HashSet.
public class Demo16 {
	public static void main(String[] args) {
		Set<Integer> marks = new HashSet<>();
		
		marks.add(10);
		marks.add(20);
		marks.add(30);
		marks.add(40);
		marks.add(50);
		
		Set<Integer> mark2 = new HashSet<>();
		mark2.add(20);
		mark2.add(40);
		mark2.add(60);
		
		marks.remove(mark2);
		System.out.println(marks);
		System.out.println(marks.size());
		System.out.println(mark2);
	}

}
