package com.venu.basic.programs;
import java.util.Scanner;

public class FabinocaiSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to to print fabinocai series");
		int num = scan.nextInt();
		scan.close();
		int firstNumber = 0;
		int secondNumber = 1;
		int sum =0;
		
		System.out.print(firstNumber);
		
		for(int i=2;i<=num;i++) {
			firstNumber = secondNumber; //1
			secondNumber=sum; //1
			sum=firstNumber+secondNumber; //1 
			System.out.print(" "+sum);
		}

	}

}
