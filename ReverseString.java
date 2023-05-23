package com.bharath.javaprograms.string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter a String");
//		we will create a scanner to point to System.in so we can receive user input; We are assigning it to a local variable named Scanner 
		Scanner scanner = new Scanner(System.in);
//			We will use .next() to find a return the next complete token from the scanner
			String input = scanner.next();
//			output variable will initially be blank
			String output = "";
			
//			Using a for loop to go through each character in the string; 
//			We will start at the end of the string (-1) and decrement i one at a time (i--) until we get to index 0 (i >= 0)
			for(int i = input.length() - 1; i >= 0; i--) {
//				We will us charAt() to return the character at the specified index in the string
				output+=input.charAt(i);
			}
			System.out.println(output);
			
//			We will demonstrate another way to return the new reversed string by using the inbuilt StringBuffer class
			System.out.println(new StringBuffer(input).reverse());

	}

}
