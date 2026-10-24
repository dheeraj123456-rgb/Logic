package ClassProblem;

import java.util.Scanner;

class InvalidPasswordException extends Exception {
	public InvalidPasswordException(String message) {
		super(message);
	}
}

public class PasswordValidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a password");

		String password = sc.next();

		try {
			if (password.length() < 8) {
				throw new InvalidPasswordException("Password must be 8 character");
			}
			System.out.println("password accepted");
		} catch (InvalidPasswordException e) {
			System.out.println("Exception " + e.getMessage());
		}
		sc.close();
	}

}
