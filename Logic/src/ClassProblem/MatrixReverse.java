package ClassProblem;

import java.util.Scanner;

public class MatrixReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int [][] matrix = new int [3][3];
		int [][] transpose = new int [3][3];
		
		System.out.println("Enter 9 digit number");
		
		for(int i = 0; i < matrix.length;i++) {
			for(int j = 0; j < matrix.length;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		for(int i = 0; i < transpose.length;i++ ) {
			for(int j= 0;j < transpose.length;j++) {
				transpose[i][j] = matrix [j][i];
			}
		}
		System.out.println("Original matrix");
		printMatrix(matrix);
		
		System.out.println("Transpose matrix");
		printMatrix(transpose);
		
	}
	public static void printMatrix(int [][]matrix) {
		for(int i = 0; i < 3;i++ ) {
			for(int j= 0;j < 3;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
