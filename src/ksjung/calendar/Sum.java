package ksjung.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		//input: two values
		//output: sum of the two values
		int a, b;
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		s1 = scanner.next();
		s2 = scanner.next();
		System.out.println(s1 + ", " + s2);
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
//		System.out.println("sum = " + (a+b));
		System.out.printf("Sum: %d", a+b);
	}
}
