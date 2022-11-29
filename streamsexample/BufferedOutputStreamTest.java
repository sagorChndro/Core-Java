package streamsexample;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamTest {
	public static void main(String[] args) throws Exception {
		FileOutputStream file = new FileOutputStream("C:/Users/Asus/Desktop/WriterStream.txt");
		BufferedOutputStream buffer = new BufferedOutputStream(file);

		String s = "Shakib Al Hasan is my favourite player";
		byte b[] = s.getBytes();

		buffer.write(b);

		buffer.flush();
		buffer.close();

		System.out.println("Success");
	}
}
