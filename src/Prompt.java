
import java.util.Scanner;

public class Prompt {

	private final static String PROMPT="cal> ";
	
	public void printMenu() {
		System.out.println("---------------------------------");
		System.out.println("| 1. 일정 등록");
		System.out.println("| 2. 일정 검색");
		System.out.println("| 3. 달 보기		");
		System.out.println("| q.종료 ");
		System.out.println("---------------------------------");
	}
	
	public void runPrompt() {
		
		printMenu();
		while(true) {
			Scanner scanner = new Scanner(System.in);
			String cmd = scanner.next();
			if (cmd.equals("1")) {
				cmdRegister();
			} else if (cmd.equals("2")) {
				cmdSearch();
			} else if (cmd.equals("3")) {
				cmdCal(scanner);
			} else if (cmd.equals("h")) {
				printMenu();
			} else if (cmd.equals("q")) {
				System.out.println("Bye");
			}
		}
		
	}
		
	

	public void cmdRegister() {
	}
	public void cmdSearch() {
	}
	public void printTerminate() {
		return;
	}
	public void cmdCal(Scanner scanner) {

		
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
	}
	public static void main(String[] args) {
		
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
