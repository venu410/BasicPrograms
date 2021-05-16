package com.venu.basic.programs;
import java.util.Scanner;

public class CheckStringPallindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to check pallindrome");
		String text = scan.next();
		scan.close();
		String result = "";
		for (int i = text.length() - 1; i >= 0; i--) {
			result = result + text.charAt(i);
		}
		if (text.equals(result)) {
			System.out.println("It is a pallindrome");
		} else {
			System.out.println("It is not a pallindrome");
		}
	}

}
