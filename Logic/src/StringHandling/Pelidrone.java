package StringHandling;
//Problem: Write a Java program to check whether a given String is a palindrome or not.


public class Pelidrone {
	public static void main(String[] args) {
		String str = "madam";
		
		Boolean isPelidrome = true;
		
		for(int i =0;i <str.length() / 2 ; i++) {
			if(str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				isPelidrome = false;
				break;
			}
		}
		if(isPelidrome) {
			System.out.println("Pelidrome");
		}else {
			System.out.println("Not pelidrome");
		}
	}

}
