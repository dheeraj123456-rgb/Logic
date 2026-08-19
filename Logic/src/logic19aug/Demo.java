package logic19aug;

public class Demo {

	public static void main(String[] args) {
		pattern1(4);
	
	}
	
	static void pattern1(int n){
		for (int i= 0; i <= n; i++) {
			for(int col = 0; col <= i ; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	
	}

}
