package stringclass.com;
/* String class -it is sequance of charater
 * ## marker interface - it doesn't have any method in interface is called marker interface
 *                       to provide by JVM achiving perticular task 
 *                       eg-clonable ,serializable,remote 
 *   chatAt()
 *   indexof()
 *   lastIndexof()
 *   isdigit()
 *   trim()-remove space 
 *   toLowercase ()
 *   ToUpperCase ()
 *   subString () pass num then trim the string form passing index
 *   startwith()
 *   split();
 *   intern();
 *   tocharArray();

 *                      

*/
public class String1 {
     static String id="Rah_u/l-4545?>2}1 k)a(ng&@#^*$ude";
      int laptop;
       
       public static void main(String[] args) {
		 String1 S1=new String1();
		 System.out.println(S1.id);
		 System.out.println("length is : "+(S1.id).length());
		 
		 System.out.println("my char array is; "+id.charAt(2));
		 System.out.println("index of alphabate ;"+id.indexOf('l'));
		 System.out.println("index last of position ;  "+id.lastIndexOf('h'));
		 
		 System.out.println("========================================================");
		 for (int i = 0; i<id.length(); i++) {
			 System.out.println(" char "+id.charAt(i)+ " index " + i);
		 
			 String S="    Indian Army";
		 
		 System.out.println(" before trim method :"+S);
		 S=S.trim();
		 System.out.println(" after trim method  :"+S);
		 
		 S=S.toLowerCase();
		 System.out.println(" after Lower case method  :"+S);
		 
		 S=S.toUpperCase();
		 System.out.println(" after UPPER case method  :"+S);
		 
		 S=S.substring(2);
		 System.out.println( " subString six digit -->>"+S);
		 
		 String z="programing Wings";
		 System.out.println("      actual String z -->>"+z);
		 z=z.substring(2, 8);
		 System.out.println( " subString 2 to 8 digit -->>"+z); 
		 System.out.println("========================================");
		 
		 String digit="";
		 String Alphabetic="";
		 String Specialchar="";
		 for (int i1 = 0; i1<id.length(); i1++) {
			 
			 if(Character.isDigit(id.charAt(i1)))
			 {
				 digit=digit+id.charAt(i1);
			 }
			 else if(Character.isAlphabetic((id.charAt(i1))))
			 { 
				 Alphabetic =Alphabetic+ id.charAt(i1);
			 }
			 else { Specialchar=Specialchar+id.charAt(i1); }
		 }	 
		 System.out.println(" is digit =         "+digit);
		 System.out.println(" is  alphabetic=    "+Alphabetic);
		 System.out.println(" is  Special char=  "+Specialchar);		 

       }
}
		 
}
