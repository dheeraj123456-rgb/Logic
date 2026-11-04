package Multithreading;

public class Demo1 {
	public static void main(String[] args) {
		World t1 = new World();
		
		t1.start();
		System.out.println(Thread.currentThread().getName());
		
		}

}
