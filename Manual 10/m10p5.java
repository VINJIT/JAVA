import java.util.Scanner;

public class m10p5
{	
	public static void main(String [] args)
	{
		int seektime=0, count=0;
		int arr[]=new int[100];
		//arr=0;
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter number of disk requests: ");
		int size=inp.nextInt();
		System.out.println("\nEnter the disk requests:(disk range is 0-99) ");

		for(int i=0;i<size;i++)
		{
			int j=inp.nextInt();
			arr[j]=1;
		}

		System.out.println("Enter head location: ");
		int headpos=inp.nextInt();

		if(arr[headpos]!=1)
			System.out.println("Invalid Head location");

		else
		{
			for(int i=headpos;i<100;i++)
			{
				if(arr[i]==1 || i==99)
				{
					seektime += i-headpos;
					arr[i]=0;
					count++;
					headpos=i;
				}
			}

			for(int i=99;i>=0;i--)
			{
				if(arr[i]==1 || i==0)
				{
					seektime += headpos-i;
					arr[i]=0;
					count++;
					headpos=i;
				}
			}
		}

		System.out.println("Total seek time is: "+seektime);
		System.out.println("Total head movements are: "+count-1);
	}
}