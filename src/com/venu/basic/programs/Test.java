package com.venu.basic.programs;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a first week day");
		int startDay = scan.nextInt();
		System.out.println("Enter a Last week day");
		int endDay = scan.nextInt();
		scan.close();
		int number=0;
		for(int i=startDay;i<=endDay;i++) {
			number = number+i;
		}
		System.out.println(number);

	}

}
