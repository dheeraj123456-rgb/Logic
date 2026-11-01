package ClassProblem;

import java.util.HashSet;

public class Demo14 {
	public static void main(String[] args) {
		HashSet<String>  studentId = new HashSet<>();
		
		studentId.add("Bihar");
		studentId.add("Jharkhand");
		studentId.add("Andhra pradesh");
		studentId.add("Bihar");
		
		System.out.println(studentId);
		System.out.println(studentId.contains("Hyderabad"));
		System.out.println(studentId.size());
		System.out.println(studentId.remove("Andhra pradesh"));
		
	}

}
