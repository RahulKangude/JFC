package objectclassmethods;


class Motherboard  implements Cloneable{
	int RAM;
	
	public Motherboard(int rAM) {
		super();
		RAM = rAM;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}


public class Deepcopypro implements Cloneable{
	int id;
	String name ;
	Motherboard m1;
  public static void main(String[] args)throws CloneNotSupportedException {
	  Motherboard mb=new Motherboard(256);
	  Deepcopypro d1=new Deepcopypro(101, "Rahul", mb);
	  
	  Deepcopypro d2=(Deepcopypro) d1.clone();
	  System.out.println(" before d1 RAM "+d1.m1.RAM);
	  System.out.println(" before d2 RAM "+d2.m1.RAM);
	  
	  d2.m1.RAM=512;
	  System.out.println("d1 RAM "+d1.m1.RAM);//only change reflect in d2
	  System.out.println("d2 RAM "+d2.m1.RAM);
	 
	  
}
@Override
public String toString() {
	return "Deepcopypro [id=" + id + ", name=" + name + "]";
}
public Deepcopypro(int id, String name, Motherboard m1) {
	super();
	this.id = id;
	this.name = name;
	this.m1 = m1;
}
@Override
protected Object clone() throws CloneNotSupportedException {
	Deepcopypro dp= (Deepcopypro) super.clone();//to get shallow copy 
	dp.m1=(Motherboard)m1.clone();
	return dp ;
}

}
