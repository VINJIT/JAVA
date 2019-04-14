import java.util.Scanner;
//import java.util.Math;
class m3p3
{
	public static void main(String args[])
	{
		int b,h;
		float hyp;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter base: ");
		b=in.nextInt();
		
		System.out.println("Enter height: ");
		h=in.nextInt();
		
		hyp=(float)Math.sqrt((b*b)+(h*h));
		
		System.out.println("Hypotenuse is: "+hyp);
	}
}

