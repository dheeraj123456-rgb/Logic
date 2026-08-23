package logic19aug;

public class Pattern6 {

	public static void main(String[] args) {
		pattern6(5);

	}
	static void pattern6(int n) {
		for(int i =1; i <= 5; i++) {
			for (int j=1; j <= 5;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
