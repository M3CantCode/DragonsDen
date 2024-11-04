
public class APCalendarTest {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sample [] = {2010, 2011, 2012};
		APCalendar test = new APCalendar();
		for (int i = 0 ; i<sample.length; i++) {
			System.out.println(test.isLeapYear(sample[i]));
		}
		System.out.println(test.numberOfLeapYears(2010, 2020));
		System.out.println();
		System.out.println(test.dayOfWeek(3, 1, 2017));
		System.out.println(test.dayOfWeek(1, 10, 2019));
		System.out.println(test.firstDayOfYear(2019));
		System.out.println(test.dayOfYear(3, 1, 2017));
		System.out.println(test.dayOfYear(3, 1, 2016));
		
	}

}
