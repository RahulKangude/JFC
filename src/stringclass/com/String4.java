package stringclass.com;

import java.util.Arrays;

public class String4 {
  public static void main(String[] args) {
	String s="A Shivaji Maharaj ";
	   int count=0;
	for (int i = 0; i < s.length(); i++) {
		 if(s.charAt(i)=='a'||s.charAt(i)=='A') {
			 count++;
			 System.out.print(s.charAt(i)+" ");
		 }
	}
	System.out.println(count);
	 
	String r="";
	
	String s1="Rkk56a12n4g9ude#";
	for (int i = 0; i < s1.length(); i++) {
		if(Character.isDigit(s1.charAt(i))) {
			r=r+s1.charAt(i++);
			//System.out.print(s1.charAt(i)+" ");
		}else {
			
		}
	}
	System.out.println(r);
	char[]arr=r.toCharArray();
	System.out.println(" arrays of char "+Arrays.toString(arr)); 
	
}
}
