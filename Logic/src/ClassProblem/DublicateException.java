package ClassProblem;
//Create a custom exception DuplicateUsernameException. 
//Throw the exception if the entered username already exists; otherwise, create the account.
import java.util.HashSet;
import java.util.Set;

class DublicateUsernameException extends Exception{
	public DublicateUsernameException(String UserName) {
		System.out.println("USERNAME ALREADY EXISTS : " + UserName);
	}
}
class AcountService{
	private final Set<String> UserNames = new HashSet<>();
	public void createAccount(String UserName) throws DublicateUsernameException{
		if(UserNames.contains(UserName)) {
			throw new DublicateUsernameException(UserName);
		}
		UserNames.add(UserName);
		System.out.println("Account created successfull for :" + UserName);
	}
}

public class DublicateException {
	
	public static void main(String[] args) {
		AcountService accountservices = new AcountService();
		try {accountservices.createAccount("Dheeraj sharma");
		accountservices.createAccount("Suraj sharma");
			
		}catch(DublicateUsernameException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
