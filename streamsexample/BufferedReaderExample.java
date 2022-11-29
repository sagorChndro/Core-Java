package streamsexample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) {

		try {
			File file = new File("C:/Users/Asus/Desktop/reader.txt");
			file.createNewFile();
			BufferedReader reader = new BufferedReader(new FileReader(file));
			// or you can read with instantiation
			// FileReader fileReader = new FileReader("file");
			String sCurrentLine;
			while ((sCurrentLine = reader.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
