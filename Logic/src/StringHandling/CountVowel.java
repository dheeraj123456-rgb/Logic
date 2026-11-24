package StringHandling;
//Write a Java program to count the number of vowels in a String.

public class CountVowel {
	public static void main(String[] args) {
		String str = "Student";
		int count = 0;
		
		for(int i=0;i < str.length();i++) {
			char ch = Character.toLowerCase(str.charAt(i));
			
			if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u') {
				count++;
			}
		}
		System.out.println("Total vowels : " + count );
		
	}

}
