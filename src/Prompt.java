
import java.util.Scanner;

public class Prompt {

	private final static String PROMPT="cal> ";
	
	public static void runPrompt() {
		
		Scanner scanner = new Scanner(System.in);
		Calender cal = new Calender();
		
		int months = 1;
		while(true) {
		
			System.out.println("달을 입력 하시오");
			System.out.print(PROMPT);
			months = scanner.nextInt();
			
			if (months == -1) {
				break ;
			} else if (months > 12) {
				continue;
			} else {
			
			cal.makeCal(months);
			
			}
		}
		
	}
	
	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
