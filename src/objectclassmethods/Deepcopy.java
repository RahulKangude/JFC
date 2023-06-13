package objectclassmethods;

public class Deepcopy implements Cloneable {
	int d;
	String deapth;
	
	Lock No;
	Lock Name;
	public Deepcopy(int d, String deapth, Lock no, Lock name) {
		super();
		this.d = d;
		this.deapth = deapth;
		No = no;
		Name = name;
	}

public static void main(String[] args)throws CloneNotSupportedException  {
	
	  Lock l=new Lock(2151, "LinkLock");
	  Deepcopy d1=new Deepcopy(500, "Borewell", l,l);
	  
	  Deepcopy d2=(Deepcopy)d1.clone();

	  System.out.println("d2-->>"+d2);
	  System.out.println("d1-->>"+d1);
	  System.out.println("before name changing  "+d2.No.lockNo);
	  System.out.println("before number changing  "+d2.Name.LockName);
	  d2.Name.LockName="Kangude";
	  d2.No.lockNo=555;
	  System.out.println();
	  System.out.println("After  Name changing --"+d2.Name.LockName);
	  System.out.println("After number changing --"+d2.No.lockNo);
	  
	  System.out.println();
	  System.out.println("before name d1 changing  "+d1.No.lockNo);
	  System.out.println("before number d1 changing  "+d1.Name.LockName);
	 
	
	  
	  
}


@Override
protected Object clone() throws CloneNotSupportedException {
	Lock lo=new Lock(No.lockNo,Name.LockName);
	Deepcopy dp= new Deepcopy(d, deapth, lo, lo);
	return dp;
}


@Override
public String toString() {
	return "Deepcopy d=" + d + ", deapth=" + deapth ;
}

}

class Lock implements Cloneable{
	int lockNo;
	String LockName;
	public Lock(int lockNo, String LockName) {
		super();
		this.lockNo = lockNo;
		LockName = LockName;
	}
}