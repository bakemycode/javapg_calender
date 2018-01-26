
import java.util.Scanner;

public class Prompt {

	private final static String PROMPT="cal> ";
	
	public int parsingDay(String str_day) {
		if (str_day.equals("SU")) return 0;
		else if (str_day.equals("MO")) return 1;
		else if (str_day.equals("TU")) return 2;
		else if (str_day.equals("WE")) return 3;
		else if (str_day.equals("TU")) return 4;
		else if (str_day.equals("FR")) return 5;
		else if (str_day.equals("SA")) return 6;
		else 
			return 0;
		
	}
	
	public void runPrompt() {
		
		Scanner scanner = new Scanner(System.in);
		Calender cal = new Calender();
		
		int years;
		int day = 1;
		int months = 1;
		
		while(true) {
		
			System.out.println("달을 입력 하시오");
			System.out.print(PROMPT);
			months = scanner.nextInt();
			
			System.out.println("요일을 입력 하시오 (SU, MO, TU, WE, TH, FR, SA)");
			System.out.print(PROMPT);
			String str_day = scanner.next();
			day = parsingDay(str_day);
			
			if (months == -1) {
				break ;
			} else if (months > 12) {
				continue;
			} else {
			
			System.out.println("년도를 입력 하시오");
			System.out.print(PROMPT);
			years = scanner.nextInt();
			cal.makeCal(years, months, day);
			
			}
		}
	scanner.close();	
	}
	
	public static void main(String[] args) {
		
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
