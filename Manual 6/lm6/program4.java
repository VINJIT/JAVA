class StringOutOfBoundClass {
	String string = "Shivam singh";

	StringOutOfBoundClass() {
		System.out.println("Character at 20 is : " + string.charAt(20));
	}
}

public class program4 {
	public static void main(String...args) {
		try {
			StringOutOfBoundClass ob = new StringOutOfBoundClass();
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException Catched");
		}
	}
}