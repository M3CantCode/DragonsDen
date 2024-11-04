import java.util.GregorianCalendar;
import java.util.Calendar;

public class APCalendar {

	
	public APCalendar () {
		
	}
	
	public boolean isLeapYear(int year) {
		double a = year % 4;
		double b = year % 400;
		if ((a == 0) || (b == 0)) {
			return true;
		} else {
			return false;
		}
	}
	public int numberOfLeapYears(int year1, int year2) {
		int counter = year1;
		int count = 0;
		while (counter <= year2) {
			if (isLeapYear(counter) == true) {
				count++;
			}
			counter++;
		}
		return count;
		
	}
	
	public int firstDayOfYear(int year) {
		GregorianCalendar gc = new GregorianCalendar(year, Calendar.JANUARY, 1);
        return gc.get(Calendar.DAY_OF_WEEK) - 1;
	}
	
	public int dayOfYear(int month, int day, int year) {
		 GregorianCalendar gc = new GregorianCalendar(year, month - 1, day);
	        return gc.get(Calendar.DAY_OF_YEAR);
	}
	
	public int dayOfWeek(int month, int day, int year) {
		int additionalDays = dayOfYear(month, day, year) - 1;
        return (firstDayOfYear(year) + additionalDays) % 7;
	}
	

	


}
