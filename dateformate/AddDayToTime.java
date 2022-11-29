package dateformate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AddDayToTime {

	public static void main(String[] args) {
		DateFormat format = new SimpleDateFormat("dd/MM/yyy");
		Calendar cal = Calendar.getInstance();

		System.out.println("Current date is : " + format.format(cal.getTime()));
		System.out.println("Next seven date form the date are : ");
		for (int i = 1; i < 8; i++) {
			cal.add(Calendar.DATE, i);
			System.out.println(format.format(cal.getTime()));
			cal = Calendar.getInstance();
		}
	}

}
