package copyconstructor.com;

public class CopyConstructor2 {
	int id;
	String name;
	
	
	public CopyConstructor2(int i, String name) {
		this.id = i;
		this.name = name;
	}
 public CopyConstructor2(CopyConstructor2 ref) {
		id = ref.id;
		name = ref.name;
	}




public static void main(String[] args) {
	CopyConstructor2 c1=new CopyConstructor2(500,"Hundai");
	CopyConstructor2 c2=new CopyConstructor2(c1);
	System.out.println(c2.id+" "+c2.name);
	
}
}
