package ClassProblem;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		
		System.out.println("Enter 9 digit elements");
		int [][] arr = new int [3][3];
		
		//input
		for(int i = 0; i < arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i = arr.length - 1; i >= 0; i--) {
			for(int j = arr.length - 1; j >= 0; j--) {
			  System.out.print(arr[i][j] + " ");
			}
			
		}
		System.out.println();
	}

}
