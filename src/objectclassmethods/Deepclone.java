package objectclassmethods;

public class Deepclone {
	public static void main(String[] args) throws CloneNotSupportedException {
		Colgate cr = new Colgate(45);
		Brush B = new Brush(cr, "Zigzag");
		System.out.println("Bfore clonning--" + B.Name + " " + B.c.q);
		Brush B1 = (Brush) B.clone();
		B1.Name = "rahul";
		B1.c.q = 895;
		System.out.println("After clonning--" + B.Name + "  " + B.c.q);

		System.out.println("After cloning--" + B1.Name + "  " + B1.c.q);
	}
}

class Colgate {
	int q;
	int y;

	Colgate(int q) {
		this.q = q;
	}
}

class Brush {
	Colgate c;
	String Name;

	Brush(Colgate c, String Name) {
		this.c = c;
		this.Name = Name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Colgate c1 = new Colgate(c.q);
		Brush B1 = new Brush(c1, Name);
		return B1;
	}
}