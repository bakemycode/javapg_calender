
import java.util.Scanner;

public class Prompt {

	private final static String PROMPT="cal> ";
	
	
	
	public void runPrompt() {
		
		Scanner scanner = new Scanner(System.in);
		Calender cal = new Calender();
		
		int year = 2014;
		int month = 1;
		
		while(true) {
		
			System.out.println("달을 입력 하시오 (종료 = -1)");
			System.out.print(PROMPT);
			month = scanner.nextInt();
			
			if (month == -1) {
				break ;
			} else if (month > 12 || month < -1 || month == 0){
				System.out.println("옳바른 값을 입력하시오 (1~12)");
				continue;
			} else {
			
			System.out.println("년도를 입력 하시오");
			System.out.print(PROMPT);
			year = scanner.nextInt();
			cal.makeCal(year, month);
 			cal.CalFirst(year, month);
 			
			}
		}
	scanner.close();	
	}
	
	public static void main(String[] args) {
		
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
