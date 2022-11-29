package serialize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeExample {

	public static void main(String[] args) {

		DeserializeExample deserialize = new DeserializeExample();
		Address address = deserialize.deserializeAddress();
		System.out.println(address);
	}

	public Address deserializeAddress() {
		Address add;
		try {
			FileInputStream file = new FileInputStream("C:/Users/Asus/Desktop/address.ser");
			ObjectInputStream object = new ObjectInputStream(file);
			add = (Address) object.readObject();
			object.close();

			return add;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
