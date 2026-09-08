package ClassProblem;

interface notification{
	void sendNotification();
	
}

class EmailNotification implements notification{
	
	@Override
	public void sendNotification() {
		System.out.println("notification will send by email");
	}
}

class smsNotification implements notification{
	
	@Override
	public void sendNotification(){
		System.out.println("notification will send by sms");
	}
}


public class Demo1 {
	public static void main(String[] args) {
		notification Notification;
		Notification = new EmailNotification();
		Notification.sendNotification();
		
		Notification = new smsNotification();
		Notification.sendNotification();
	}

}
