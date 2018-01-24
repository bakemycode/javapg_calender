public class Calender {

	private final int[] MONTHS={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int daysOfMonth(int month) 
	{	 
		return MONTHS[month - 1];
	}
	
	public void makeCal(int months) {
		System.out.printf("%8d 월",months);
		System.out.println();
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		
		for(int i = 1; i < daysOfMonth(months); i++ ) {
			System.out.printf("%3d", i);
			
			if(i % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println();
	}
}