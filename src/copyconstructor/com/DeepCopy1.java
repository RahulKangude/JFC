package copyconstructor.com;

public class DeepCopy1 {
	
	int id;
	String college;
public DeepCopy1(int id, String college) {
	super();
	this.id = id;
	this.college = college;
}
public static void main(String[] args) {
	
}
}

class Deep implements Cloneable{
	int id;
	String college;
public Deep(int id, String college) {
	super();
	this.id = id;
	this.college = college;
	
//	Object clone() throws CloneNotSupportedException {
//		DeepCopy1 d=new DeepCopy1(100, "JSPM");
//		d.id=this.id;
//		d.college =this.college;
//		return d;
//	}
	
}
}