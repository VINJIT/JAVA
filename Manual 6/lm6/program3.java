public class program3 {
	public static void main(String...args) {
		try {
			System.out.print(5/0);
		}finally {
			System.out.print("Finally Code");
		}
	}
}