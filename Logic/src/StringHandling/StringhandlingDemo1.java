package StringHandling;

public class StringhandlingDemo1 {
	public static void main(String[] args) {
		
		String str = "Bipin";
		String reverse = "";
		
		for(int i=str.length() - 1; i >=0;i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println("Original length : " + str);
		System.out.println("reverse length : " + reverse);
	}

}
