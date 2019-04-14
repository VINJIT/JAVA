import java.util.Scanner;

class m3p5{
	 public static void main(String[] args) {
		
		float temp,cel;

		Scanner in=new Scanner(System.in);
		System.out.print("Enter Temperature in fahrenheit: ");

		temp=in.nextInt();

		cel=(float)((temp*32)/1.8);

		System.out.print("\nTemperature in Celcius is: "+cel);
	}
}
