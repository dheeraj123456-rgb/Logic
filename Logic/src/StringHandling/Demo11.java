package StringHandling;

import java.util.Arrays;
import java.util.Scanner;

public class Demo11 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter first character");
		String str1 = sc.next();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("enter second character");
		String str2 = sc2.next();
		
		
		
		if(str1.length() != str2.length()) {
			System.out.println("Not Anagrams");
		}else {
			char [] c1 = str1.toCharArray();
			char [] c2 = str2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println(c1);
			System.out.println(c2);
			if(Arrays.equals(c1, c2)) {
				System.out.println("Both strings are anagrams");
			}else {
				System.out.println("not anagrams");
			}
		}
	}

}
