import java.util.Scanner;

public class Maximumdates {

	private final int[] MONTHS={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int maxDaysOfMonths(int month) {
		 
		return MONTHS[month - 1];
		
		}
	public static void main(String[] args) {
		
		Maximumdates maxx = new Maximumdates();
	
		System.out.println("달을 입력 하시오");
		Scanner scanner = new Scanner(System.in);
		
		int input_month = scanner.nextInt();
		
		System.out.println(input_month + "의 날짜 수는"+ maxx.maxDaysOfMonths(input_month)+"입니다");
		
		scanner.close();
	}
}
