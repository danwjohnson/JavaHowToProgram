package com.dan.training.java.chap2;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String args[]) {
		
		int x;
		int y;
		int sum;
		int quotient;
		int difference;
		int product;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first integer: ");
		x = input.nextInt();
		System.out.print("Enter the second integer: ");
		y = input.nextInt();
		
		sum = x + y;
		difference = x - y;
		product = x * y;
		quotient = x / y;
		
		System.out.println("The sum of the integers is: " + sum);
		System.out.println("The difference of the integers is: " + difference);
		System.out.println("The product of the integers is: " + product);
		System.out.println("The quotient of the integers is: " + quotient);
		
	}
	
}
