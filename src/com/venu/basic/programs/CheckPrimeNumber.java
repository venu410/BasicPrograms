package com.venu.basic.programs;
import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check Prime or Not");
		int num = scan.nextInt();
		scan.close();
		boolean isNotPrime = false;

		if (num == 0 || num == 1) {
			System.out.println(num + " is not a Prime Number");
		}

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.println(num + " Is not a Prime Number");
				isNotPrime = true;
				break;
			}

		}
		if (!isNotPrime) {
			System.out.println(num + " Is a Prime Number");
		}

	}

}
