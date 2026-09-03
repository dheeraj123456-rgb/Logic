package ClassProblem;

import java.util.Scanner;

public class LeaderElement {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int [] arr = new int [6];
	
	System.out.println("Input 6 element");
	
	for(int i = 0;i < 6;i++) {
		arr[i] = sc.nextInt();
	}
	int max = arr[arr.length - 1];
	System.out.println("Leader elements");
	
	//last element is always leader
	System.out.println(max + " ");
    // Traverse from right to left
	for(int i = arr.length - 2; i >= 0;i--) {
		if(arr[i] > max) {
			max  = arr[i];
			System.out.println(max + " ");
		  }
       	}

	}

}
