package logic19aug;

import java.io.File;
import java.io.IOException;

public class Demo1 {
	public static void main(String[] args) {
		try {
			File folder = new File("E:\\java-online");

			if (!folder.exists()) {
				folder.mkdir();
				System.out.println("Folder created");
			}else {
				System.out.println("File already exist");
			}
				File file = new File(folder, "Superclass.txt");
				if (file.createNewFile()) {
					System.out.println("File created");
				} else {
					System.out.println("Folder already exists");
				}
			

		} catch (IOException e) {
			System.out.println("error:" + e.getMessage());
		}
	}
}
