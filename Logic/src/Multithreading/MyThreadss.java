package Multithreading;

public class MyThreadss extends Thread{
	
	public MyThreadss(String name,int priority) {
		super(name); // set thread name
		setPriority(priority); // set thread priority 1-10
	}
	
	public void run() {
		System.out.println(getName() + " With priority " + getPriority() + " is running");
	}
	
	public static void main(String[] args) {
		    MyThreadss t1 = new MyThreadss("Thread 1", 3);  
	        MyThreadss t2 = new MyThreadss("Thread 2", 7);  
	        MyThreadss t3 = new MyThreadss("Thread 3", 5);  
	        MyThreadss t4 = new MyThreadss("Thread 4", 7);  
	        MyThreadss t5 = new MyThreadss("Thread 5", 2);  
	        

	        t1.start();  
	        t2.start();  
	        t3.start();  
	        t4.start();  
	        t5.start();  
	        
	        
	        
	  
	}

}
