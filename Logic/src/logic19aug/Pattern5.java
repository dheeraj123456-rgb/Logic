package logic19aug;

public class Pattern5 {

	public static void main(String[] args) {
		pattern5(9);
	}
	
	static void pattern5(int n) {
		for(int i =1; i < 2 * n; i++) {
			int c =i > n ? 2 * n - i - 1 : i; 
			
			for(int col = 0; col < c ; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
