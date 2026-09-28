package ClassProblem;

import java.util.Scanner;

//.Write a Java program to print all elements of a 2D array in spiral order.
public class Demo7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rows...");
		int rows = sc.nextInt();
		
		System.out.println("Enter column...");
		int cols =sc.nextInt();
		
		int [] [] arr = new int[rows][cols];
		
		
		//inputs
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j] =sc.nextInt();
			}
		}
		
		//spiral boundries
		int top = 0;
		int button = rows - 1;
		int left = 0;
		int right = cols - 1;
		
		System.out.println("Print spiral order: ");
		
		//left to right
		
		while(top <= button && left <= right) {
			for(int j = left;j<right;j++) {
				System.out.println(arr[top][j] + " ");
			}
			top++;
			
			//top to button
			
			for(int i=0;i<= button;i++) {
				System.out.println(arr[i][right] + " ");
			}
			right--;
			//Right to left
			if(top <= button) {
				for(int j=0;j<right;j--) {
					System.out.println(arr[right][j]+" ");
				}
				button --;
				
				//button to top
				if(left <= right) {
					for(int i=0;i<=top;i--) {
						System.out.println(arr[i][left]+ " ");
					}
					left ++;
				}
			}
			sc.close();
		}
	}
}
