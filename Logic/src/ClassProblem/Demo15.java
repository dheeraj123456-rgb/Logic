
	package ClassProblem;

	import java.util.HashSet;
	import java.util.Set;

	public class Demo15 {
		public static void main(String[] args) {
		
		Set<Integer> students = new HashSet<>();

		students.add(101);
		students.add(102);
		students.add(103);
		students.add(104);
		students.add(105);

		students.removeIf(n -> n % 2 == 0);

		System.out.println(students);
		System.out.println(students.size());
		
		}
	}


