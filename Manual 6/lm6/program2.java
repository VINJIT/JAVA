import java.io.BufferedReader;
import java.io.InputStreamReader;

interface Stack {
	public void push(int item);
	public void pop();
	public void display();
	void increaseSize() throws Exception;
}

class DynamicStack implements Stack {
	int[] a;
	static int top = -1;
	int size;
	
	@Override
	public void push(int item) {
		if(top == size-1) {
			System.out.println("OVERFLOW");
			return;
		}
		a[++top] = item;
	}
	
	@Override
	public void pop() {
		if(top == -1) {
			System.out.println("UNDERFLOW");
			return;
		}
		//return a[top--];
		top--;
	}
	
	@Override
	public void display() {
		for(int i=top; i>=0; i--)
			System.out.println(a[i]);
	}
	
	@Override
	public void increaseSize() throws Exception {
		System.out.print("Enter size of array : ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Integer n = Integer.parseInt(reader.readLine());
		size = n;
		int temp[] = new int[n];
		for(int i=0; i<=top; i++) {
			temp[i] = a[i];
		}
		a = temp;
	}
}

public class program2 {
	public static void main(String...args) throws Exception {
		Integer ch;
		BufferedReader reader;
		reader = new BufferedReader(new InputStreamReader(System.in));
		DynamicStack d = new DynamicStack();
		System.out.print("Enter the size of array : ");
		Integer n = Integer.parseInt(reader.readLine());
		d.size = n;
		d.a = new int[n];
		do {
			System.out.println("***** MENU *****");
			System.out.println("1. PUSH");
			System.out.println("2. POP");
			System.out.println("3. DISPLAY");
			System.out.println("4. INCREASE SIZE OF ARRAY");
			System.out.println("0. EXIT");
			System.out.print("3. Enter ur choice : ");
			String input = reader.readLine();
			ch = Integer.parseInt(input);
			switch(ch) {
				case 1:System.out.print("Enter value to be inserted : ");
						Integer item = Integer.parseInt(reader.readLine());
						d.push(item);
						break;
				case 2:d.pop();
						break;
				case 3:d.display();
						break;
				case 4:d.increaseSize();
						break;
				case 0:System.exit(0);
			}
		}while(ch != 0);
		reader.close();
	}
}