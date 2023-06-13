package copyconstructor.com;

public class CopyConstructor1 {
	int roll_no;
	String name;

	public CopyConstructor1(int roll_no, String name) {
		this.roll_no = roll_no;
		this.name = name;
		//System.out.println(roll_no + " " + name);
	}

	public CopyConstructor1(CopyConstructor1 ref) {
		roll_no = ref.roll_no;
		name = ref.name;
		//System.out.println(roll_no + " " + name);
	}

	public static void main(String[] args) {

		CopyConstructor1 cc = new CopyConstructor1(45, "Rahul");
		CopyConstructor1 cc1 = new CopyConstructor1(cc);

		cc.roll_no = 500;
		System.out.println(cc.name + " " + cc.roll_no);
		System.out.println(cc1.name + " " + cc1.roll_no);
	}
}
