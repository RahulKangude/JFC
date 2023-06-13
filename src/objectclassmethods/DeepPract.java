package objectclassmethods;

public class DeepPract implements Cloneable {
	int age;
	String Student;
	NoteBook1 page;
	NoteBook1 Name;

	public DeepPract(int age, String student, NoteBook1 page, NoteBook1 name) {
		super();
		this.age = age;
		Student = student;
		this.page = page;
		Name = name;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		NoteBook1 n = new NoteBook1(200, "ClassMate");
		DeepPract d1 = new DeepPract(25, "Rahul", n, n);

		DeepPract d2 = (DeepPract) d1.clone();
		System.out.println(d1);
		System.out.println(d2);
		
		d2.page.pageNo = 500;
		d2.Name.noteBookName = "Sundaram";
		System.out.println(d1);
		System.out.println(""+d2);

	}

	@Override
	public String toString() {
		return "DeepPract [age=" + age + ", Student=" + Student + ", pageno=" + page.pageNo + ", Name="
				+ Name.noteBookName + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		DeepPract d3=(DeepPract	)super.clone();//shallow clonning 
		d3.Name= (NoteBook1)Name. clone();
		d3.page= (NoteBook1) page.clone();
		return d3;
	}
	
}

class NoteBook1 implements Cloneable {
	int pageNo;
	String noteBookName;

	public NoteBook1(int pageNo, String noteBookName) {
		super();
		this.pageNo = pageNo;
		this.noteBookName = noteBookName;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	

}