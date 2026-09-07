package ClassProblem;

interface payment{
	void makePayment();
}

class paymentDetails{
	int paymentId;
	String costomerName;
	double amount;
	
	paymentDetails(int paymentId,String costomerName,double amount){
		this.paymentId = paymentId;
		this.costomerName = costomerName;
		this.amount = amount;
	}
	

	void PaymentDisplaydetails () {
		System.out.println("Payment id = " + paymentId);
		System.out.println("Costomer name = " + costomerName);
		System.out.println("Amount = " + amount);
	}
}

     class UPIPayment extends paymentDetails implements payment{
    	 UPIPayment (int paymentId,String costomerName,double amount ){
    		 super(paymentId,costomerName,amount);
    	 }
    	 
    	 @Override
    	 public void makePayment() {
    		 System.out.println("Making payment by upi ..............");
    	 }
   }

     class cardPayment extends paymentDetails implements payment{
    	 cardPayment ( int paymentId,String costomerName,double amount  ){
    		 super(paymentId,costomerName,amount);
    	 }
    	 
    	 @Override
    	 public void makePayment() {
    		 System.out.println("Making payment by card ...........");
    	 }
    }

public class Demo {
	
	public static void main(String[] args) {
		paymentDetails payments;
		payments = new UPIPayment(101,"Dheeraj sharma",15260.00);
		payments.PaymentDisplaydetails();
		payment pay = (payment ) payments;
		pay.makePayment();
		
		
		System.out.println("........................X....................");
		
		
		payments = new cardPayment(102,"Suraj kumar",25632.00);
		payments.PaymentDisplaydetails();
		pay = (payment) payments;
		pay.makePayment();
		
		
	}

}
