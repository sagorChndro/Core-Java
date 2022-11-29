package property;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class ReadPorperty {

	public static void main(String[] args) {
		Properties property = new Properties();
		InputStream input = null;

		try {
			input = new FileInputStream("C:/Users/Asus/Desktop/property.properties");

			property.load(input);

			System.out.println(property.getProperty("database"));
			System.out.println(property.getProperty("dUser"));
			System.out.println(property.getProperty("dPassword"));

			Enumeration<?> e = property.propertyNames();
			while (e.hasMoreElements()) {
				String key = (String) e.nextElement();
				String value = property.getProperty(key);
				System.out.println("Key : " + key + ", Value : " + value);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
