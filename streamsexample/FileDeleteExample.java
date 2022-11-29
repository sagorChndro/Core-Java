package streamsexample;

import java.io.File;

public class FileDeleteExample {

	public static void main(String[] args) {
		try {
			File deleteFile = new File("C:/Users/Asus/Desktop/Writer.doc");

			if (deleteFile.delete()) {
				System.out.println("File delete");
			} else {
				System.out.println("File does't find to delete");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
