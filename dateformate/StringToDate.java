package dateformate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

	public static void main(String[] args) throws ParseException {
		String input_date = "19.10.2021";

		DateFormat date = new SimpleDateFormat("dd.MM.yyyy");

		Date date1 = date.parse(input_date);
		System.out.println(date1);

	}

}
