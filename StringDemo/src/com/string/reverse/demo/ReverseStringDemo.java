package com.string.reverse.demo;

import java.util.Scanner;

/**
 * @author Anshul_Goyal
 * 
 * Class to demonstrate the reverse string example 
 */
public class ReverseStringDemo {

	/**
	 * @param args
	 */
	public static void main(String... args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the string to be reversed...");
		
		String str = scanner.nextLine();
		long startTime = System.currentTimeMillis();
		String reverse = "";
		for(int i = str.length()-1; i>=0 ; i--){
			reverse += str.charAt(i);
		}
		System.out.printf("The reverse string is :::::%s\n",reverse);
		long endTime = System.currentTimeMillis();
		System.out.println("Total Time: "+(endTime - startTime));
		
		scanner.close();
	}

}
