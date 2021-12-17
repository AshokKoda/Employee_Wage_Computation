package com.bridgelabz.linecomparsion;

import java.util.Scanner;

/*
 * Line Comparison
 */
public class CalculateLength {

	public static void main(String[] args) {

		System.out.println("-----Welcome To Line Comparison-----------");

		int x1, y1, x2, y2;
		double a;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter X1 value: ");
		x1 = sc.nextInt();
		System.out.println("Enter Y1 value: ");
		y1 = sc.nextInt();
		System.out.println("Enter X2 value: ");
		x2 = sc.nextInt();
		System.out.println("Enter Y2 value: ");
		y2 = sc.nextInt();

		a = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);

		System.out.println("Length of the line = " + a);

	}

}
