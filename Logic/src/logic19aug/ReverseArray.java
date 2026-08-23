package logic19aug;
//1,2,3,4,5,6,7,8,9
public class ReverseArray {

	public static void main(String[] args) {
		int [] arr = {10,20,30,50,6,9,2};
		
		for (int i=arr.length-1; i >= 0; i--) {
			System.out.println(arr[i]+" ");
		}
	}

}

