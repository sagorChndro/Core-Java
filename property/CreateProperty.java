package property;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class CreateProperty {

	public static void main(String[] args) {
		Properties property = new Properties();
		OutputStream output = null;

		try {
			output = new FileOutputStream("C:/Users/Asus/Desktop/property.properties");

			// set the property value
			property.setProperty("database", "localhost");
			property.setProperty("dUser", "Tutul");
			property.setProperty("dPassword", "123");

			// set properties to project root folder
			property.store(output, null);
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
