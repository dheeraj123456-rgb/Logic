package Multithreading;
//Create a Java class named StudentTask that extends the Thread class.

//Requirements:
//1. Create an instance variable taskName.
//2. Create a constructor to initialize taskName.
//3. Override the run() method.
//4. Print "taskName Started".
//5. Pause execution for 3 seconds using Thread.sleep(3000).
//6. Print "taskName Completed".
//7. In the main method, create two objects: "Assignment" and "Study".
//8. Execute both using start().
public class StudentTask extends Thread {
	
	private String TaskName;
	
	StudentTask(String name){
		this.TaskName = name;
	}
	
	
	public void run() {
		System.out.println(TaskName + " Task Started");
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(TaskName +" task completed");
	}
	
	
	public static void main(String[] args) {
		StudentTask St = new StudentTask("Assignement");
		StudentTask St2 = new StudentTask("Study");
		
		St.start();
		St2.start();
	}

}
