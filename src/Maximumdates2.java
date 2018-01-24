import java.util.Scanner;

public class Maximumdates2 {

	private final static String PROMPT="cal>";
	
	private final int[] MONTHS={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int maxDaysOfMonths(int month) {
		 
		return MONTHS[month - 1];
		
		}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int input_months = 1;
		while(true) {
		
			System.out.println("달을 입력 하시오");
//			System.outp
//			input_months = scanner.nextInt();
			
			if (input_months == -1) {
				break ;
			} else if (input_months > 12) {
				continue;
			} else if (input_months == 2) {
			
				System.out.println("일 월 화 수 목 금 토");
				System.out.println("-------------------");
				System.out.println("1  2  3  4  5  6  7");
				System.out.println("8  9  10 11 12 13 14");
				System.out.println("15 16 17 18 19 20 21");
				System.out.println("22 23 24 25 26 27 28");
			} else if( input_months == 4 || input_months == 6 || input_months == 9 || input_months == 11) {
				System.out.println("일 월 화 수 목 금 토");
				System.out.println("-------------------");
				System.out.println("1  2  3  4  5  6  7");
				System.out.println("8  9  10 11 12 13 14");
				System.out.println("15 16 17 18 19 20 21");
				System.out.println("22 23 24 25 26 27 28");
				System.out.println("29 30");
			} else if( input_months == 1 || input_months == 3 || input_months == 5 || input_months == 7 || input_months == 8 || input_months == 10 || input_months == 12) {
				System.out.println("일 월 화 수 목 금 토");
				System.out.println("-------------------");
				System.out.println("1  2  3  4  5  6  7");
				System.out.println("8  9  10 11 12 13 14");
				System.out.println("15 16 17 18 19 20 21");
				System.out.println("22 23 24 25 26 27 28");
				System.out.println("29 30 31");
				
			}
		
		
	
			}
		scanner.close();
	}
}
