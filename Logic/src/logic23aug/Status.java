package logic23aug;

public class Status {

	public static void main(String[] args) {
       String status = paymentStatus.SUCCESS;
	   System.out.println(status);
	   
	   
	   
	   PaymentStatus2 status2 = PaymentStatus2.SUCCESS;
	   System.out.println(status2.name());
	}
}

class paymentStatus{
	public static final String SUCCESS = "Payment successfull";
	public static final String PENDING = "Pending";
	public static final String FAILED = "Payment Failled";
}

enum PaymentStatus2 {
	SUCCESS,
	FAILED,
	PENDING;
}
	class PaymentStatus3{
	public static final int SUCCESS = 1;
	public static final int FAILED = 2;
	public static final int PENDING = 3;
	
}
