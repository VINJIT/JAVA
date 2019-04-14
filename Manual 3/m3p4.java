import java.util.Scanner;

class m3p4{
	 public static void main(String[] args) {
		
		int size,temp;

		Scanner in=new Scanner(System.in);
		System.out.print("Enter size of array: ");

		size=in.nextInt();

		int arr[]=new int[size];

		System.out.print("\nEnter the array: ");
		for(int i=0;i<size;i++)
		{
			arr[i]=in.nextInt();
		}

		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}

		System.out.print("\nThe sorted array is: ");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+", ");
		}
	}
}