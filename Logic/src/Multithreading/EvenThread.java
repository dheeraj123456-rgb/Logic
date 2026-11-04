package Multithreading;

public class EvenThread extends Thread {
	
	@Override
	public void run() {
		for(int i=2; i<=10;i +=2) {
			System.out.println("Even number "+i);
		}
	}
	public static void main(String[] args) {
		EvenThread even = new EvenThread();
		OddThread odd = new OddThread();
		
		even.start();
		odd.start();
	}

}
