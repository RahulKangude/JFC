package objectclassmethods;

class MotherBoard1 {
	int RAM;
	int carno;

	public MotherBoard1(int RAM, Integer carno) {
		super();
		this.RAM = RAM;
		this.carno = carno;
	}
}

public class Shallow2 implements Cloneable {
	int i;;
	String name;
	MotherBoard1 M;
	MotherBoard1 n;

	public Shallow2(int i, String name, MotherBoard1 M, MotherBoard1 n) {
		super();
		this.i = i;
		this.name = name;
		this.M = M;
		this.n = n;
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		MotherBoard1 B1 = new MotherBoard1(512, 1851);

		Shallow2 s1 = new Shallow2(10, "Rahul", B1, B1);

		Shallow2 s3 = (Shallow2) s1.clone();
		System.out.println(s3+ " RAM=" + s3.M.RAM);
		System.out.println(s1 + " carno--" + s1.M.carno);
		System.out.println("RAM of motherboard==" + s1.M.RAM + "<<-->> " + s1.n.carno);
		s3.M.RAM = 1024;
		System.out.println("RAM of  after motherboard-->>" + s1.M.RAM);
		System.out.println(s1.equals(s3));
	}

	@Override
	public String toString() {
		return "i=" + i + ", name=" + name;
	}
}
