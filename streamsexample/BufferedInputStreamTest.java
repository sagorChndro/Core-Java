package streamsexample;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamTest {
	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream("C:/Users/Asus/Desktop/WriterStream.txt");
			BufferedInputStream writer = new BufferedInputStream(file);

			int i;
			while ((i = writer.read()) != -1) {
				System.out.print((char) i);
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

}
