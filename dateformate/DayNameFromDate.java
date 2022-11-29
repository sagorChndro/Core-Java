package dateformate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DayNameFromDate {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any date : ");
		String input_date = scanner.next();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		try {
			date = format.parse(input_date);
		} catch (ParseException e) {
			e.printStackTrace();
		} finally {

			SimpleDateFormat format1 = new SimpleDateFormat("EEEE");
			SimpleDateFormat format2 = new SimpleDateFormat("EE");
			String fullDayName = format1.format(date);
			String shortDayName = format2.format(date);

			System.out.println(fullDayName);
			System.out.println(shortDayName);
		}
	}

}
