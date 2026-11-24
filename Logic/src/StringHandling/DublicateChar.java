package StringHandling;
//Write a Java program to remove duplicate characters from a String.


public class DublicateChar {
	public static void main(String[] args) {
		
		String str = "Programming";
		
		StringBuilder result = new StringBuilder();
		
		for(int i=0;i < str.length();i++) {
			char ch = str.charAt(i);
			
			if(result.indexOf(String.valueOf(ch)) == -1) {
				result.append(ch);
			}
		}
		System.out.println("original String " + str);
		System.out.println("After removing dublicates "+ result );
		
	}

}
