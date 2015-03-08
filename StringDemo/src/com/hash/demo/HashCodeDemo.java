/**
 * 
 */
package com.hash.demo;

import java.util.ArrayList;

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
		
		String str = "2009";
		System.out.println(str.hashCode());
		
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
		
		System.out.println("Array List element hash code :: "+arrayList.get(0).hashCode());
		
	}

}
