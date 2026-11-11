package Multithreading;

public class Restaurant extends Thread {
	
	private String OrderName;
	
	Restaurant(String name){
		this.OrderName = name;
		
		System.out.println(OrderName + " Order Preparing");
	}
	
	public void run() {
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(OrderName + " Order Completed");
	}
	
	
	public static void main(String[] args) {
		Restaurant R1 = new Restaurant("Burger");
		Restaurant R2 = new Restaurant("Pizza");
		
		R1.start();
		R2.start();
	}

}
