package stringclass.com;

public class String7 {
	public static void main(String[] args) {
   
		String s1=new String("HelloWorld");
		String s2="Hello";
		String s3="World";
		String s4=s2.concat(s3);
	    String s5="HelloWorld";
	    
	    System.out.println(s1==s4);
	    System.out.println(s1.equals(s4));
	    System.out.println(s4==s5);
	    System.out.println(s4.equals(s5));
	    System.out.println(s1==s5);
	    System.out.println(s1.equals(s5));

	
	
	
	
	
	
	
	}
}
