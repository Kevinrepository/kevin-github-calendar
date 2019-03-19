package ksjung.calendar;

import java.util.Scanner;

public class Calendar {
	
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getMaxDaysOfMonth(int month) { return MAX_DAYS[month - 1]; }
	
	private void printSampleCalendar() {
		System.out.println("일    월    화   수    목   금    토");
		System.out.println("--------------------");
		System.out.println("                1  2");
		System.out.println(" 3  4  5  6  7  8  9");
		System.out.println("10 11 12 13 14 15 16");
		System.out.println("17 18 19 20 21 22 23");
		System.out.println("24 25 26 27 28 29 30");
		System.out.println("31                  ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// maximum dates of input month
		String PROMPT = "cal> ";
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		int month = 1;
		
		while(true) {
			System.out.print("Input month: ");
			System.out.print(PROMPT);
			month = scanner.nextInt();
			if (month == -1) {
				break;
			}
			
			if (month > 12) {
				System.out.println("Please correctly input month.");
				continue;
			}
			System.out.printf("Month %d has %d days\n", month, cal.getMaxDaysOfMonth(month));
		}
		
		System.out.println("Bye~");
		scanner.close();
	}

}
