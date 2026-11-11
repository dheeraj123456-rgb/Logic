package Multithreading;
//Question: Write a Java program to demonstrate multithreading by simulating two bank transactions (Deposit and Withdrawal) 
//using the Thread class. Each transaction should execute concurrently, display a start message,
//wait for 2 seconds using Thread.sleep(), and then display a completion message.
public class BankTransaction extends Thread {
	
	private String TransactionName;
	
	BankTransaction(String name){
		this.TransactionName = name;
	}
	@Override
	public void run() {
		System.out.println(TransactionName + " Started");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(TransactionName + " Completed");
	}
	public static void main(String[] args) {
		BankTransaction BT = new BankTransaction("Deposit");
		BankTransaction BT2 = new BankTransaction("Withdrawal");
		
		BT.start();
		BT2.start();
		
	}

}
