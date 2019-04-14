import java.util.Scanner;

class program9
{
	public static void main(String args[])
	{
		int n;
		float var=0;
		
		System.out.println("Enter the number of terms: ");
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			var=var+(float)1/i;
		}
		
		System.out.println("Sum of series upto "+n+" is: "+var);
	}
}
