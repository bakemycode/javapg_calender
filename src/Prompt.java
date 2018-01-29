
import java.text.ParseException;
import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> ";

	public void printMenu() {
		System.out.println("---------------------------------");
		System.out.println("| 1. 일정 등록");
		System.out.println("| 2. 일정 검색");
		System.out.println("| 3. 달력 보기");
		System.out.println("| q. 종료 ");
		System.out.println("---------------------------------");
	}

	public void registerPlan(Calendar cal, Scanner scanner) throws ParseException {
		int exit;

		while (true) {
			System.out.println("[일정등록]");
			System.out.println("날짜를 입력하세요 (yyyy-mm-dd)");
			String date = scanner.next();
			System.out.println();
			
			System.out.println("계획을 입력하세요");
			String plan = scanner.nextLine();
			cal.registerPlan(date, plan);
			System.out.println("저장되었습니다.");

			System.out.println("메뉴로 돌아가려면 (-1)");
			exit = scanner.nextInt();
			if (exit == -1) {
				runPrompt();
			}
		}
	}

	public void searchPlan(Calendar cal, Scanner scanner) throws ParseException {
		int exit;

		while (true) {
			System.out.println("[일정검색]");
			System.out.println("날짜를 입력하세요 (yyyy-mm-dd)");
			String date = scanner.next();

			cal.searchPlan(date);
			System.out.println("메뉴로 돌아가려면 (-1)");
			exit = scanner.nextInt();
			if (exit == -1) {
				runPrompt();
			}
		}
	}

	public void checkCalendar(Calendar cal, Scanner scanner) throws ParseException {

		int year = 2014; // 임의의 값
		int month = 1; // 임의의 값

		while (true) {

			System.out.println("달을 입력 하시오. (메뉴로 돌아가기 = -1)");
			System.out.print(PROMPT);
			month = scanner.nextInt();

			if (month == -1) {
				runPrompt();
			} else if (month > 12 || month < -1 || month == 0) {
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

	public void runPrompt() throws ParseException {

		printMenu();
		Calendar cal = new Calendar();
		Scanner scanner = new Scanner(System.in);

		while (true) {

			String cmd = scanner.next();
			if (cmd.equals("1")) {
				registerPlan(cal, scanner);
			} else if (cmd.equals("2")) {
				searchPlan(cal, scanner);
			} else if (cmd.equals("3")) {
				checkCalendar(cal, scanner);
			} else if (cmd.equals("4")) {
				System.out.println("Bye");
			}

		}
	}

	public static void main(String[] args) throws ParseException {

		Prompt p = new Prompt();
		p.runPrompt();
	}
}
