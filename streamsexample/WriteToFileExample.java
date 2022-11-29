package streamsexample;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileExample {

	public static void main(String[] args) {
		try {

			String content1 = "This is content number one";
			String content2 = "This is content number two";

			File file = new File("C:/Users/Asus/Desktop/reader.txt");

			// if file doesn't exist
			// if (!file.exists()) {
			// file.createNewFile();

			FileWriter writee = new FileWriter(file, true);
			BufferedWriter writer = new BufferedWriter(writee);
			writer.write(content1);
			writer.newLine();
			writer.write(content2);
			writer.newLine();
			writer.close();

			System.out.println("Done");
			// } else {
			// System.out.println("File Exists");
			// }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
