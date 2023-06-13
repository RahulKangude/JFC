package stringclass.com;

public class String6 {
  public static void main(String[] args) {
	 String a="rahul";
	 String b= new String("pranav");
	String  b1=b;
	  b1="rk";
	  
	  int x=10;
	  int y=x;
	    y=20;
	    
	    String s=new String("Rahul\n");
	    
	    s=s.concat("789");
	    System.out.println(s);
	    
	    
	   StringBuffer sb=new StringBuffer("String\n");
	    System.out.println(sb);
	   sb= sb.append("12345");
	    System.out.println(sb);
	 
	 
	 System.out.println(b1);
	 System.out.println(y);
	 }
}
