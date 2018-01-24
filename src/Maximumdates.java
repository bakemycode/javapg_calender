import java.util.Scanner;

public class Maximumdates {

	public static void main(String args[]) {
		
		int months[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.println("달을 입력 하시오");
		Scanner scanner = new Scanner(System.in);
		
		String month;
		month = scanner.nextLine();
		
		int a;
		
		a = Integer.parseInt(month);
		
		System.out.println(months[a-1]);
		
		scanner.close();
		
		
	}
}
