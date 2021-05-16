package com.venu.basic.programs;
import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scan.nextInt();
		scan.close();
		for(int i=1;i<=53;i++) {
			int result = number * i;
			System.out.println(number+ "*" +i+ " = "+result);
		}

	}

}
