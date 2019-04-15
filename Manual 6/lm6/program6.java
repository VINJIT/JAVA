class Test {
	void display() throws ArithmeticException {
		System.out.println(5/0);
	}
}

class MyException extends Exception {
	String s = "MY EXCEPTION";
	
	@Override
	public String toString() {
		return ("TO STRING RETURN " + s);
	}
}

public class program6 {
	public static void main(String...args) {
		try {
			Test t = new Test();
			t.display();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Catched");
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException Catched");
		}catch(ArithmeticException e) {
			System.out.println("Divide By zero exception");
		}finally {
			System.out.println("Finally Block");
		}
		
		try {
			throw new MyException();
		}catch(MyException m) {
			System.out.println("My exception "+m);
		}
	}
}

// Using try with resources = !clear