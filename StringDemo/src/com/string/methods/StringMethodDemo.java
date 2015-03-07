/**
 * 
 */
package com.string.methods;

/**
 * @author Anshul_Goyal
 *
 */

class App{
	
	private int id;
	
	private String name;
	
	
	public App(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public String toString(){
		
		return "ID : " + id + " Name : " + name; 
		
	}
	
}

public class StringMethodDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// String method : print object
		
		App app = new App(1, "Susie");
		App app2 = new App(2, "Bob ");
		System.out.println(app);
		System.out.println(app2);
		
		System.out.println("============================================================================\n");
		/**
		 * The methods below outline the usage of String concatenation, StringBuilder and Stringbuffer for 
		 * identifying the time consumed to create a string with 1E5 (1 million) counts.
		 * 
		 * First sample uses string concatenation operator and the result shows that it is very expensive to 
		 * use the concatenation operator when we need to create string reference.
		  
		 */
		
		//String concatination
		System.out.println("============================================================================\n\n");
		
		long startTime = System.currentTimeMillis();
		for(int i=0 ; i<1E5;i++){
			String str = "This is the concat example ";
			str += " ";
			str += " Enjoy concatination";
			//System.out.println(str);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Total time used in concatenation Loop :: "+ (endTime - startTime));
		
		System.out.println("============================================================================");
		
		
		/**
		 * StringBuilder:
		 *  
		 * Shows that the String Builder is used and it reduces the string creation very easy 
		 * as only one instance is created for each iteration and then the strings are appended in the 
		 * buffer.
		 */
		
		long startTimeBuilder = System.currentTimeMillis();
		for(int i=0 ; i<1E5;i++){
			StringBuilder builder = new StringBuilder();
			builder.append("This is the concat example ");
			builder.append(" ");
			builder.append(" Enjoy concatination");
			//System.out.println(builder.toString());
		}
		long endTimeBuilder = System.currentTimeMillis();
		System.out.println("Total time used in builder loop :: "+ (endTimeBuilder - startTimeBuilder));
		
		System.out.println("============================================================================");
		
		/**
		 * 
		 * Shows that the String Buffer is used and it reduces the string creation very easy 
		 * as only one instance is created for each iteration and then the strings are appended in the 
		 *
		 */
		//String Buffer		
		long startBuf = System.currentTimeMillis();
		for(int i=0 ; i<1E5;i++){
			StringBuffer builder = new StringBuffer();
			builder.append("This is the concat example ");
			builder.append(" ");
			builder.append(" Enjoy concatination");
			//System.out.println(builder.toString());
		}
		long endBuf = System.currentTimeMillis();
		System.out.println("Total time used in buffer loop :: "+ (endBuf - startBuf));
				
	}

}
