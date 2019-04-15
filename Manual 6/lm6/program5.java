public class program5 {
	public static void main(String...args) {
		int a[] = new int[5];
		try {
			System.out.println(a[6]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException catched");
		}
	}
}