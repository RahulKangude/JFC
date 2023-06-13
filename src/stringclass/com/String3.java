package stringclass.com;

import java.util.Arrays;

public class String3 {
	public static void main(String[] args) {
		/*split();    	 
		 *  * 
		 */
		String s="Ahmednagar city";
	    String s1="";
		System.out.println(s.toLowerCase().startsWith("a"));
		System.out.println(s.endsWith("a"));
		System.out.println(s1.trim().isEmpty());
		char [] A=s.toCharArray();
		System.out.println(Arrays.toString(A));

		System.out.println("reverse buffer :"+new StringBuffer(s).reverse());
		for (int i = s.length()-1; i >=0 ; i--) {
			System.out.print(s.charAt(i));
		}
        System.out.println("\n-----------------------------" );
        
		String[] str= s.split(" ");
		System.out.println(Arrays.toString(str));
		for (int i =  str.length-1; i>=0; i--) {
			System.out.print(str[i]+" ");
		}
		System.out.println("\n------------------------");
		char[] ss= s.toCharArray(); 
		System.out.println(ss);
	}
}
