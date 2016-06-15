package com.mnl.app.my_app_simple;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println(add(1, 3));

	}

	public static int add(int i, int j) {
		int sum = 0;
		sum = i + j;
		return sum;
	}

	public static int minus(int first, int second) {
		int minus = first - second;
		return minus;
	}

	public static int divide(int first, int second) {
		int div = first / second;
		return div;
	}

	public static int multiply(int first, int second) {
		int product = first * second;
		return product;
	}
}
