package com.bridgelabz.linecomparsion;

import java.util.Scanner;

/*
 * CheckTwoLinesAreEqualOrLessOrGreater
 */
public class CheckTwoLinesAreEqualOrLessOrGreater {

	public static void main(String[] args) {
		
		int x1, y1, x2, y2, x3, y3, x4, y4;
		double a, b;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter X1 value: ");
		x1 = sc.nextInt();
		System.out.println("Enter Y1 value: ");
		y1 = sc.nextInt();
		System.out.println("Enter X2 value: ");
		x2 = sc.nextInt();
		System.out.println("Enter Y2 value: ");
		y2 = sc.nextInt();
		System.out.println("Enter X3 value: ");
		x3 = sc.nextInt();
		System.out.println("Enter Y3 value: ");
		y3 = sc.nextInt();
		System.out.println("Enter X4 value: ");
		x4 = sc.nextInt();
		System.out.println("Enter Y4 value: ");
		y4 = sc.nextInt();
		
		a = (double) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);
        b = (double) Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2) * 1.0);
        
        if (Double.compare(a, b) == 0)
        {
            System.out.println(("Both lines are equal"));
        }
        else if (Double.compare(a, b) < 0) {
            System.out.println(("Both lines are less"));
        }
        else if (Double.compare(a, b) > 0) {
            System.out.println(("Both lines are greater"));
        }
        else {
            System.out.println("Both are not equal");
        }

	}

}
