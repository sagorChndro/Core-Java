package streamsexample;

import java.io.File;

public class CreateFileExample {

	public static void main(String[] args) throws Exception {

		File file = new File("C:/Users/Asus/Desktop/reader.doc");

		if (file.createNewFile()) {
			System.out.println("File Created");
		} else {
			System.out.println("File is already exist");
		}
	}

}
