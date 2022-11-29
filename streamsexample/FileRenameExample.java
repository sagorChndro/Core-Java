package streamsexample;

import java.io.File;

public class FileRenameExample {

	public static void main(String[] args) {
		File oldFile = new File("C:/Users/Asus/Desktop/reader.doc");
		File newFile = new File("C:/Users/Asus/Desktop/Writer.doc");

		if (oldFile.renameTo(newFile)) {
			System.out.println("Rename successfull");
		} else {
			System.out.println("Rename Failed");
		}
	}

}
