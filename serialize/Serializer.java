package serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializer {
	public static void main(String[] args) {

		Serializer serilize = new Serializer();

		Address address1 = new Address();
		address1.setStreet("Wall Road");
		address1.setCountry("London");
		// call to the serialize object
		System.out.println(address1);
		serializeAddress(address1);

		Address address2 = new Address();
		address2.setStreet("54, Inner Circle Road");
		address2.setCountry("Bangladesh");
		System.out.println(address2);
		serializeAddress(address2);
	}

	public static void serializeAddress(Address add) {
		try {
			FileOutputStream file = new FileOutputStream("C:/Users/Asus/Desktop/address.ser");
			ObjectOutputStream obj = new ObjectOutputStream(file);
			obj.writeObject(add);
			obj.flush();
			obj.close();

			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
