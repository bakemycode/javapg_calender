public class Calender {

	private final int[] MONTHS={0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private final int[] LEAP_YEARS={0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
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
			start_month += daysOfMonth(year,i);
		}
		
		start_day = (start_day + start_month + how_many_days) % 7;
	
		return start_day;
	}
	
	
	public void makeCal(int year, int month) {
		System.out.printf("%4d년  %3d월 ",year, month);
		System.out.println();
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		
		for(int i = 1; i < CalFirst(year,month); i++) {
			System.out.printf("   ");
		}
		for(int i = 1; i < daysOfMonth(year, month) + 1; i++ ) {	

			System.out.printf("%3d", i);
			
			if (7 - CalFirst(year,month) + 1 == i % 7) {
				System.out.println();
				
				}
				}
	}
	
		
		}



