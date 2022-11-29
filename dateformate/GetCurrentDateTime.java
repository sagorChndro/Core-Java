package dateformate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetCurrentDateTime {
	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd hh/mm/s a");
		DateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy");

		Date date = new Date();
		System.out.println(date);

		System.out.println(dateFormat.format(date));

		Calendar cal = Calendar.getInstance();
		String st = cal.getTime().toString();
		System.out.println(dateFormat1.format(cal.getTime()));
	}
}
