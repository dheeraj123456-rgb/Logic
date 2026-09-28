
package ClassProblem;

import java.io.File;
import java.io.IOException;

public class CreateFolder {

    public static void main(String[] args) {

        try {

            // Create folder
            File folder = new File("E:\\classSqlTask\\CreateFile");

            if (!folder.exists()) {

                folder.mkdir();

                System.out.println("Folder created");

            } else {

                System.out.println("Folder already exists");
            }

            // Create file inside folder
            File file = new File(folder, "Index.txt");

            if (file.createNewFile()) {

                System.out.println("File created");

            } else {

                System.out.println("File already exists");
            }

        } catch (IOException e) {

            System.out.println("Error : " + e.getMessage());
        }
    }
}

