package ksjung.calendar;

import java.util.Scanner;

public class Prompt {
	
	public int parseDay(String week) {
		if (week.equals("su")) return 0;
		else if (week.equals("mo")) return 1;
		else if (week.equals("tu")) return 2;
		else if (week.equals("wd")) return 3;
		else if (week.equals("th")) return 4;
		else if (week.equals("fr")) return 5;
		else if (week.equals("sa")) return 6;
		else return 0;
	}

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 1;
		int year = 2017;
		int weekday = 0;

		while(true) {
			System.out.println("Input year.");
			System.out.print("YEAR> ");
			year = scanner.nextInt();
			System.out.println("Input month.");
			System.out.print("MONTH> ");
			month = scanner.nextInt();
			System.out.println("Input first week(su, mo, tu, wd, th, fr, sa).");
			String str_weekday = scanner.next();
			weekday = parseDay(str_weekday);
			
			if (month == -1) {
				break;
			}

			if (month > 12) {
				System.out.println("Please correctly input month.");
				continue;
			}
//			System.out.printf("Month %d has %d days\n", month, cal.getMaxDaysOfMonth(month));
			
			cal.printCalendar(year, month, weekday);
		}

		System.out.println("Bye~");
		scanner.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
