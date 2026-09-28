package ClassProblem;

import java.io.File;
import java.io.IOException;

public class Demo12 {
	public static void main(String[] args) {
		try {
			File folder = new File("E:\\V-cube");
			
			if(!folder.exists()) {
				folder.mkdir();
				System.out.println("File already exists!");
			}else {
				System.out.println("Folder created");
			}
			//create file inside the folder
			File file = new File(folder,"index.html");
			
			if(file.createNewFile()) {
				System.out.println("File created");
			}else {
				System.out.println("folder already created");
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
