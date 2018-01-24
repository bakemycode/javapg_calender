import java.util.Scanner;

public class Maximumdates {

	private final int[] MONTHS={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int maxDaysOfMonths(int month) {
		 
		return MONTHS[month - 1];
		
		}
	public static void main(String[] args) {
		
		Maximumdates maxx = new Maximumdates();
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("반복 횟수를 력하세?");
		int input_times = scanner.nextInt();
		int times[] = new int[input_times];
		
		System.out.println("달을 입력 하시오");
		for(int i = 0; i<input_times; i++) {
		
			times[i]= scanner.nextInt();
		}
		
		for(int j = 0; j<input_times; j++) {
		
			System.out.println(times[j] + "월의 날짜 수는 "+ maxx.maxDaysOfMonths(times[j])+"일 입니다");
		}
		
		
		
//		System.out.println("달을 입력 하시오");
//		int input_month = scanner.nextInt();
		
		
		
		
		
		
		
		scanner.close();
	}
}
