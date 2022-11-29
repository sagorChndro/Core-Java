package dateformate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateToString {
	public static void main(String[] args) {

		// Create an instance of SimpleDateFormat used for formatting
		// the string representation of date (month/day/year)
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");

		// Get the today using Calendar object
		Date today = Calendar.getInstance().getTime();

		// Using DateFormat format method we can create a string
		// representation of a day with the define format
		String repotDate = format.format(today);

		// print what date is today
		System.out.println("Current date is: " + repotDate);
	}

}
