package com.string.reverse.demo;

/**
 * @author Anshul_Goyal
 * 
 * Class to demonstrate the reverse string example 
 */
public class ReverseStringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		String str1 = "Hello World";
		String reverse = "";
		for(int i = str1.length()-1; i>=0 ; i--){
			reverse += str1.charAt(i);
		}
		System.out.printf("The reverse string is :::::%s\n",reverse);
		long endTime = System.currentTimeMillis();
		System.out.println("Total Time: "+(endTime - startTime));
		
	}

}
