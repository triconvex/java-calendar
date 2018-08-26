package zingoworks.calendar;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal>";

	public void runPrompt() {
		String PROMPT = "cal> ";
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 1;
		while (true) {
			System.out.println("월을 입력하세요.");
			System.out.print(PROMPT);
			month = scanner.nextInt();
			if (month == -1) {
				break;
			}

			if (month > 12) {
				continue;
			}

			System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getMaxDaysOfMonth(month));
			cal.printCalendar(2017, month);
			System.out.println("");

		}
		
		System.out.println("종료");
		scanner.close();
	}

	public static void main(String[] args) {
		// 셀 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
