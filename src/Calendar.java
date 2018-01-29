
//import java.util.HashMap;
import java.util.Date;
import java.util.HashMap;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Calendar {

	private final int[] MONTHS = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private final int[] LEAP_YEARS = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	private HashMap<Date, String> planMap; // 잘모르겠

	public Calendar() {
		planMap = new HashMap<Date, String>();
	}

	public int daysOfMonth(int year, int month) {

		if (isLeapYear(year) == false) {
			return MONTHS[month];
		} else {
			return LEAP_YEARS[month];
		}
	}

	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || (year % 100 == 0 && year % 400 == 0)) {
			return true;
		}
		return false;
	}

	public int CalFirst(int year, int month) {

		int start_day = 5; // Thu
		int start_month = 0;
		int how_many_days = 0;

		for (int i = 1970; i < year; i++) {
			if (isLeapYear(i) == true) {
				how_many_days += 366;
			} else if (isLeapYear(i) == false) {
				how_many_days += 365;
			}
		}

		for (int i = 1; i < month; i++) {
			start_month += daysOfMonth(year, i);
		}

		start_day = (start_day + start_month + how_many_days) % 7;

		return start_day;
	}

	public void makeCal(int year, int month) {
		System.out.printf("%4d년  %3d월 ", year, month);
		System.out.println();
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");

		for (int i = 1; i < CalFirst(year, month); i++) {
			System.out.printf("   ");
		}
		for (int i = 1; i < daysOfMonth(year, month) + 1; i++) {

			System.out.printf("%3d", i);

			if (7 - CalFirst(year, month) + 1 == i % 7) {
				System.out.println();

			}
		}

		System.out.println();
	}

	public void registerPlan(String strDate, String strPlan) throws ParseException {

		// HashMap<String, String> map = new HashMap<String, String>();
		// map.put(strDate, strPlan); 내가 생각했던 부분....인데

		Date date = new SimpleDateFormat("yyyy-MM-dd").parse(strDate);
		planMap.put(date, strPlan);
	}

	public String searchPlan(String strDate) throws ParseException {

		// HashMap<String, String> map = new HashMap<String, String>();
		// System.out.println(map.containsKey(strDate)); 이부분도내가생각한거

		Date date = new SimpleDateFormat("yyyy-MM-dd").parse(strDate);
		String plan = planMap.get(date);
		return plan;
	}

	public static void main(String[] args) throws ParseException {
		Calendar cal = new Calendar();

		cal.registerPlan("2012-02-02", "let's it beef");
	}
}
