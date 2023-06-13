package stringclass.com;

public class String2 {
	public static void main(String[] args) {


		String email="rahulkangude4@gmail.com";
		int position= email.indexOf('.');

		email=email.substring(position);
		System.out.println(email);

		for (int i1 = 0; i1 < email.length(); i1++) {

			if(email.startsWith("r")) {
			 
				System.out.println("yes");
		}
	}	 
		System.out.println("position index "+position);
		
		for (int i = 0; i < email.length(); i++) {
			System.out.print(email.charAt(i));
		}

}
}
