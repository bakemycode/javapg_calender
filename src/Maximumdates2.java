import java.util.Scanner;

public class Maximumdates2 {

	private final int[] MONTHS={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int maxDaysOfMonths(int month) {
		 
		return MONTHS[month - 1];
		
		}
	public static void main(String[] args) {
		
		Maximumdates2 maxx = new Maximumdates2();
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("반복 횟수를 력하세?");
		int input_times = scanner.nextInt();
		
		for(int i = 0; i<input_times; i++) {
			
			System.out.println("달을 입력 하시오");
			int input_months = scanner.nextInt();
			System.out.println(input_months + "월의 날짜 수는 "+ maxx.maxDaysOfMonths(input_months)+"일 입니다");
		}
		
		scanner.close();
	}
}
