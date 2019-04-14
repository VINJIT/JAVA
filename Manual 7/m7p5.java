import java.util.Scanner;

class m7p5 extends Thread
{
	int a;

	m7p5(int a) {
		this.a = a;
	}
	public void run()
	{
		boolean flag = false;
		for(int i=2; i<=a/2; i++) {
			if(a % i == 0) {
				flag = true;
				break;
			}
		}
		if(flag == true)
			System.out.println("NOT a prime number");
		else
			System.out.println("PRIME number");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = scanner.nextInt();
		m7p5 m = new m7p5(n);
		m.start();
	}
}