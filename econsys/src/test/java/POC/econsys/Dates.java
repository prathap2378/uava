package POC.econsys;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Dates {

	public static void main(String[] args) {
		Dates.dateFormat();
		Dates.calenderFormat();
	}

	public static String dateFormat() {
		DateFormat df = new SimpleDateFormat("dd-MM-yy");
		Date dateObj = new Date();
		String date = df.format(dateObj);
		return date;
	}
	public static void calenderFormat(){
		DateFormat  df1 = new SimpleDateFormat("dd/MM/yy  HH:mm:ss");
		Calendar calendarObj = Calendar.getInstance();
		
	}
}
