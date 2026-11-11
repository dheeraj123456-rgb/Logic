package Multithreading;

class bookmyShow{
	 
	int availableSeats = 10;
	
	public synchronized void bookTicket(String name, int seats) {
		System.out.println(name + " is trying to book " + seats  + " seats");
		
		if(availableSeats >= seats) {
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
				return;
			}
			
			availableSeats = availableSeats -= seats;
			
			System.out.println(name + " your tickets booked successfully!");
			
			System.out.println("Remaining seats: " + availableSeats);
			
			System.out.println(".......................................................");
		}else {
			System.out.println("Sorry " + name + ", seats are not available");
		}
	}
	
}


 class customer extends Thread{

	bookmyShow bms;
	String name;
	int seats;
	
	customer(bookmyShow bms,String name,int seats){
		this.bms = bms;
		this.name = name;
		this.seats = seats;
	}
	
	public void run() {
		bms.bookTicket(name, seats);
	}
	
 }	
	public class BookMyShows{
		
	public static void main(String[] args) {
		bookmyShow bms = new bookmyShow();
		
		customer c1 = new customer(bms,"Dheeraj",4);
		customer c2 = new customer(bms,"suraj",2);
		customer c3 = new customer(bms,"anjit",7);
		
		c1.start();
		c2.start();
		c3.start();
		
		

	}
	}

