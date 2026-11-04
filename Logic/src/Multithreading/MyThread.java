package Multithreading;

class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("Running state");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		MyThread t1 = new MyThread();
		System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.getState());
		System.out.println(Thread.currentThread().getState());
		Thread.sleep(3000);
	}

}
