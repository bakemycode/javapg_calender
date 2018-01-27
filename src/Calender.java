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
			
	public int CalFirst(int year) {

		int first_day = 0;
		
		System.out.println(year);
		
		int how_many_leeps = 0;
		
		for (int i = 0; i <= year; i++) {
			if (i % 4 == 0 && i % 100 != 0 || (i % 100 == 0 && i % 400 == 0)) {
				how_many_leeps += 1;
				}	
		}
		System.out.println(how_many_leeps);
		first_day = (how_many_leeps + year) % 7;
		System.out.println(first_day);
		return first_day;
	}
	
	
//	public void makeCal(int year, int month) {
//		System.out.printf("%4d년  %3d월 ",year, month);
//		System.out.println();
//		System.out.println(" SU MO TU WE TH FR SA");
//		System.out.println("---------------------");
//		
//		for(int i = 1; i <= CalFirst(year) - 1; i++) {
//			System.out.printf("   ");
//		}
//		for(int i = 1; i < daysOfMonth(year, month) + 1; i++ ) {	
//
//			System.out.printf("%3d", i);
//			if ((CalFirst(year) - 1) % 7 == 0) {
//				if(i % 7 == 0) {
//					System.out.println();
//					}
//			} else if ( (CalFirst(year) - 1) % 7 > 0) {
//				if ( i % 7 == CalFirst(year)) {
//					System.out.println();
//				}
//				}
//		System.out.println();
//	System.out.println();
//	}
//}
}

