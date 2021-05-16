package com.venu.basic.programs;
import java.util.Scanner;

public class CheckNumberPallindrome {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check Pallindrome");
		int num = scan.nextInt();
		scan.close();
		int temp = num;
		int sum = 0, r;

		while (num > 0) {
			r = num % 10;
			num = num / 10;
			sum = sum * 10 + r;

		}

		if (sum == temp)
			System.out.println(temp + " Number is a Pallindrome");
		else
			System.out.println(temp + " Number is not a Pallindrome");

	}

}
