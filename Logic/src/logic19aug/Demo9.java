package logic19aug;

public class Demo9 {
	public static void main(String[] args) {
		try {
			checkEligibility(-19);
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
	}
 public static void checkEligibility(int age) {
	 if(age <= 0) {
		 throw new IllegalArgumentException("Age can not be negative");
	 }
	 if(age > 18) {
		 System.out.println("Age is eligible");
	 }
 }
}
