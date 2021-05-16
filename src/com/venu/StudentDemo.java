package com.venu;

public class StudentDemo {

	StudentDemo() {
		System.out.println("Default Constructor");
	}

	public static void main(String[] args) {

		StudentDemo demo = new StudentDemo();
		demo.add(10, 20);

		// StudentDemo.add(10, 30);

		// syntax
		// <ClassName> ref = new <ClassName>();

	}

	public void add(int a, int b) {
		System.out.println(a + b);

	}

}
