public class Calender {

	private final int[] MONTHS={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private final int[] LEAP_YEARS={31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int daysOfMonth(int year, int month) {
		
		if (isLeapYear(year) == false) {
			return MONTHS[month - 1];
		} else {
			return LEAP_YEARS[month -1];
		}
	}
	
	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || (year % 100 == 0 && year % 400 == 0)) {
			return true;
			}
		return false;
		}
			
	
	public void makeCal(int years, int months, int day) {
		System.out.printf("%4d년  %3d월 ",years, months);
		System.out.println();
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
	
		for(int j = 1; j <= day; j++) {
			System.out.print("   ");
		}

		for(int i = 1; i < (7+1) - day; i++ ) {	
			
			System.out.printf("%3d", i);
			}
		
		System.out.println();
		
			
		for(int i = 7 - day + 1; i < daysOfMonth(years, months) + 1; i++ ) {	

			System.out.printf("%3d", i);
			
			if(day == 0) {
				if(i % 7 == 0) {
					System.out.println();
				}
			}
			else if (day > 0) {
				if(i % 7 == 7 - day)
					System.out.println();
				}
			}
		System.out.println();
	}
	}

