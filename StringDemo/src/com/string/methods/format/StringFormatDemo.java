/**
 * 
 */
package com.string.methods.format;

import java.util.Date;

/**
 * @author Anshul_Goyal
 *
 */
public class StringFormatDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Format complete date and time
		System.out.print(String.format("The complete date is :%tc\n", new Date()));
		//Alternate
		System.out.printf("The complete date is :%tc\n", new Date());
		
		//Format Just time
		System.out.print(String.format("The Time is :%tr\n", new Date()));
		//Alternate
		System.out.printf("The Time is :%tr\n", new Date());
		
		//Day of week, month and day
		Date today = new Date();
		System.out.print(String.format("Today is :%tA, %tB, %td\n", today, today, today));

		//Alternate without duplicating the argument
		System.out.printf("Today is :%tA, %<tB, %<td\n", new Date());
				
	}

}
