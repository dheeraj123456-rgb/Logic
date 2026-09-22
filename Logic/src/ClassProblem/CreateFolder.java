package ClassProblem;

import java.io.File;
import java.io.IOException;

public class CreateFolder {
	public static void main(String[] args) {
		try {
			File folder = new File("E:\\classSqlTask\\CreateFile");
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("Folder created");
		}
		//file created
		File file = new File(folder,"Index.txt");
		if(file.createNewFile()) {
			System.out.println("File created ");
		}else {
			System.out.println("File already exits");
		}
	}catch(IOException e) {
		System.out.println("Error : " + e.getMessage());
	}
	}
}
