package stringclass.method;

import java.io.UnsupportedEncodingException;

public class StringDemo {
  public static void main(String[] args) throws UnsupportedEncodingException {
	String d="Rahul Suresh Kangude";
	System.out.println(d.codePointAt(4));
	System.out.println(d.intern());
	String f=(d.concat("visapur"));
	System.out.println(d.length());
	System.out.println(d.compareTo(f));
	System.out.println(d.endsWith("ey"));
	System.out.println(d.codePointBefore(8));
	System.out.println(d.contentEquals(d));
	System.out.println(d.replace("K", "p"));
	//System.out.println(d.getBytes("K"));
	//System.out.println(String.valueOf(7895));
	System.out.println(d.split("S "));
	System.out.println(String.valueOf(78l));
	
}
}
