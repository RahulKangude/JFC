package stringclass.method;

public class Customstring {

	private int i;
	Customstring(int j) {
		this.i=i;
	}
	public Customstring  modifiy(int i) {
		if(this.i==i) {
			return (this);
		} else {  
			return new Customstring(i);
		}
	}



	
	public static void main(String[] args) {
		Customstring m1=new Customstring(100);
		Customstring m2=new Customstring(10);
		Customstring m3=new Customstring(10);
		
		
		
		
		String s="Pavilion";
		System.out.println("is Empty or not ="+s.isEmpty());
		System.out.println("length =" +s.length());
		System.out.println("repalce old char to new char ="+s.replace('a' , 'i'));
		System.out.println("cut the string form given index ="+s.substring(2,6));
		System.out.println("cut the string form given index ="+s.substring(2));
		System.out.println("find first index of given character ="+s.indexOf('l'));
		System.out.println("find last index of given character ="+s.indexOf('l'));
		System.out.println("lower case ="+s.toLowerCase());
		System.out.println("upper case ="+s.toUpperCase());
		
		String w="   Indian army      ";
		System.out.println("trim method remove space="+w.trim());
		
		String a="capital";
		String b=a.toString();
		System.out.println(a==b);
		
	}
     
     
}


