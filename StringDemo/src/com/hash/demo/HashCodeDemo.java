/**
 * 
 */
package com.hash.demo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Anshul_Goyal
 * 
 * This class demonstrates the hash code implementation for different elements
 *
 */
public class HashCodeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * Hashcode is implemented using following:
		 * s.charAt(0) * 31 ^ n-1 + s.charAt(1) * 31 ^ n-2 + ... + s.charAt(n-1)
		 * 
		 * e.g. String str = "ABC";
		 * 
		 * int hashcode = "A" * 31 ^ (3-1) + "B" * 31 ^ (3-2) + "C"
		 * 
		 * "A", "B", "C" will be converted to the Ascii code so,
		 * 
		 * hashcode = 65* 31 ^(3-1) + 66 * 31 ^(3-2) + 67 
		 *  
		 * 
		 *  
		 * 
		 */
		String str = "ABC";
		System.out.println(str.hashCode());
		System.out.println("Calculated Hash code is :: "+"Aa".hashCode() + "-----" + "BB".hashCode());
		String str1 = new String("2009");
		System.out.println(str1.hashCode());
		
		Integer obj1 = new Integer(2009);
		System.out.println("Integer hashcode : "+obj1.hashCode());
		
		Integer obj2 = Integer.parseInt("2009");
		System.out.println("Integer hashcode :Parse INT: "+obj2.hashCode());
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(Integer.parseInt("2010"));
		
		System.out.println("Array List hash code  :: "+arrayList.hashCode());
		
		System.out.println("-------------------------------------------");
		
		Iterator<Integer> iterator = arrayList.iterator();
		
		System.out.println("Array List element hash code :: "+ iterator.next().hashCode());
		
		HashCodeDemo codeDemo = new HashCodeDemo();
		System.out.println(codeDemo.hashCode());
		
		//Negative hash code
		String obj3 = "199999999999999999999";
		System.out.println(obj3.hashCode());
		
	}

}
