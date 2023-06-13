package objectclassmethods;

public class Shallowclone {
	public static void main(String[] args) throws CloneNotSupportedException {

		Cat c=new Cat(20);
		Dog d=new Dog(c, 50);
		System.out.println("Original object-->>"+d.i+" "+d.c.j);

		Dog d2=(Dog) d.clone();
		d2.i=555;  //beacuse it only create primitive  value clone 
		d2.c.j=685;//it change the original value of cat class value.
		//it dont create separate copy
		System.out.println("clone object-->>"+d.i+" "+d.c.j); 
		System.out.println("clone object-->>"+d.i+" "+d.c.j); 
		
	}
}

class Cat{
	int j;
	Cat(int j){
		this.j=j;
	}
}
class Dog implements Cloneable{
	int i;
	Cat c;
	Dog(Cat c,int i){
		this.c=c;
		this.i=i;
	}

	protected Object clone()throws CloneNotSupportedException {
		return super.clone();
	}


}