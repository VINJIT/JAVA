import java.util.Scanner;

class Account {
	String name;
	int acNo;
	char type;
	
	
	
	
}

class Curr_acct extends Account {
	
}

class Sav_acct extends Account {
	
}

class program7 {
	public static void main(String...args) {
		Scanner input = new Scanner(System.in);
		Curr_acct c = new Curr_acct();
		Sav_acct s = new Sav_acct();
		System.out.println("******* MENU ******");
		System.out.println();
		System.out.println("1. DEPOSIT");
		System.out.println("2. WITHDRAW");
		System.out.println("3. BALANCE");
		System.out.println();
		System.out.print("Enter ur choice : ");
		int ch = input.nextInt();
	}
}