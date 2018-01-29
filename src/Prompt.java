import java.io.*;


import java.text.ParseException;
import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> ";

	public void printMenu() {
		System.out.println("---------------------------------");
		System.out.println("| 1. 일정 등록");
		System.out.println("| 2. 일정 검색");
		System.out.println("| 3. 달력 보기");
		System.out.println("| 4. 저장 하기");
		System.out.println("| 5. 불러 오기");
		System.out.println("| q. 종료 ");
		System.out.println("---------------------------------");
	}

	
	public void registerPlan(Calendar cal, Scanner scanner) throws ParseException, IOException {
		
		int exit;

		while (true) {	// 이 부분에서 입력값 두 개를 각각 따로 받아야 하는데 하나만 작동해서 영상에 나온 트릭 사용
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

	public void searchPlan(Calendar cal, Scanner scanner) throws ParseException, IOException {
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

	public void checkCalendar(Calendar cal, Scanner scanner) throws ParseException, IOException {

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

	public void planSave(Calendar cal) throws IOException {
		
		FileWriter reader = new FileWriter("/Users/jun/eclipse-workspace/planlist.txt");
	
		reader.write(cal.registerPlan());
		
		reader.close();
	}
	
	public void planLoad(Calendar cal) throws IOException{
		FileReader reader = new FileReader("/Users/jun/eclipse-workspace/planlist.txt");
		int ch;
		while ((ch = reader.read()) != -1){
			System.out.print((char)ch);
		}
		reader.close();
		
	}
	
	public void runPrompt() throws ParseException, IOException {

		printMenu();
		Calendar cal = new Calendar();
		Scanner scanner = new Scanner(System.in);
		
		boolean isLoop = true;
		while (isLoop) {
			System.out.println("실행할 메뉴의 버튼을 입력하세요");
			String select_menu = scanner.next();
			switch (select_menu) {
				case "1": registerPlan(cal, scanner);
					break;
				case "2": searchPlan(cal, scanner);
					break;
				case "3": checkCalendar(cal, scanner);
					break;
				case "4": planSave(cal);
					break;
				case "5": planLoad(cal);
					break;
				case "q": 
					System.out.println("bye");
					isLoop = false;
					break;
			
			}
		}
	}

	public static void main(String[] args) throws ParseException, IOException {

		Prompt p = new Prompt();
		p.runPrompt();
	}
}
