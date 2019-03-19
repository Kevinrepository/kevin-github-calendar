package ksjung.calendar;

import java.util.Scanner;

public class Calendar {
	
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private static final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	/**
	 * 윤년
	 * 4로 나누어 떨어지는 수
	 * 100으로 나누어 떨어지는 수는 28일
	 * 400으로 나누어 떨어지는 수는 윤년
	 **/
	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			return true; 
		else
			return false;
	}
	
	public int getMaxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month - 1];
		} else {
			return MAX_DAYS[month - 1];
		}
	}
	
	public void printCalendar(int year, int month, int weekday) {
		System.out.printf("     <<%4d%3d>>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("--------------------");
		
		// print blank space
		for (int i = 0; i < weekday; i++) {
			System.out.print("   ");
		}
		int maxDay = getMaxDaysOfMonth(year,month);
		int count = 7 - weekday;
		
		// print first line
		for (int i = 1; i <= count; i++) {
			System.out.printf("%3d",i);
		}
		System.out.println();
		
		// print from second line to last
		for(int i = count + 1; i <= maxDay; i++) {
			System.out.printf("%3d",i);
			if ((i - count) % 7 == 0) System.out.println();
		}
		System.out.println();
		System.out.println();
	}

	

}
