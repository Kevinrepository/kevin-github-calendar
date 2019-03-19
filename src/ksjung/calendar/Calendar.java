package ksjung.calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("일    월    화   수    목   금    토");
		System.out.println("--------------------");
		System.out.println("                1  2");
		System.out.println(" 3  4  5  6  7  8  9");
		System.out.println("10 11 12 13 14 15 16");
		System.out.println("17 18 19 20 21 22 23");
		System.out.println("24 25 26 27 28 29 30");
		System.out.println("31                  ");
		
		// maximum dates of input month
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input month: ");
		int month = scanner.nextInt();
		
		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		System.out.printf("Month %d has %d days\n", month, maxDays[month]);
	}

}
