package Stack;

import java.util.Stack;

public class Demo2 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		stack.push(10);
		stack.push(15);
		stack.push(80);
		stack.push(30);
		
		
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.empty());
		System.out.println(stack.search(10));
	}

}
