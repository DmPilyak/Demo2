package com.itbulls.learnit.pilyak;

import java.util.Scanner;

public class Demo {
	
	public static void area_of_the_triangle() {
		for(;;) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first side of the triangle: ");
		int first = sc.nextInt();
		System.out.print("Enter the second side of the triangle: ");
		int second = sc.nextInt();
		System.out.print("Enter the third side of the triangle: ");
		int third = sc.nextInt();
		
		if((third >= first + second) || (first >= third + second) || (second >= first + third)) {
			System.out.println("Invalid data, try again");
			continue;
		} else {
				double perimeter = (double)(first + second + third) / 2;
				double res = perimeter*(perimeter - first)*(perimeter - second)*(perimeter - third);
				res = Math.sqrt(res);
				System.out.println("Area of the triangle is: "  + res);
				System.out.println();
				break;
				}
			}
	}

	
	public static void sum_of_integers() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first value: ");
		double a = sc.nextDouble();
		System.out.print("Enter the second value: ");
		double b = sc.nextDouble();
		double sum = a + b;
		int res = (int)sum;
		System.out.println("Sum is: " + res);
		System.out.println();
		
	}
	
	
	public static void circumference() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius circle: ");
		double radius = sc.nextDouble();
		double pi = 3.1415;
		double circumference = 2*pi*radius;
		System.out.println("Circumference is: " + circumference);
	}
	
	
	
	public static void menu() {
		System.out.println("***MENU***");
		System.out.println("1. Calculate atea of the triangle. ");
		System.out.println("2. Calculate sum of 2 integers values.");
		System.out.println("3. Calculate circle circumference.");
		System.out.println("4. Exit");
	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			menu();
			System.out.println("Select: ");
			int ch = sc.nextInt();
			System.out.println();
			switch(ch) {
			case 1:
				area_of_the_triangle();
				break;
			case 2:
				sum_of_integers();
				break;
			case 3:
				circumference();
				break;
			case 4:
				System.exit(0);
				break;
			}
		}
		
	}

}


