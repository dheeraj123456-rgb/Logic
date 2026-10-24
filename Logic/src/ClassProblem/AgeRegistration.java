package ClassProblem;

import java.util.Scanner;

class invalidAgeException extends Exception {
	public invalidAgeException(String message) {
		super(message);
	}
}

public class AgeRegistration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age: ");
		int age = sc.nextInt();

		try {
			if (age < 18) {
				throw new invalidAgeException("Age must be 18 or above");
			}
			System.out.println("Registration successfull");
		} catch (invalidAgeException e) {
			System.out.println("Exception " + e.getMessage());
		}
		sc.close();
	}

}
