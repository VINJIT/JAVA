import java.util.Scanner;

class m3p7{
	 public static void main(String[] args) {
		
		int size;

		Scanner in=new Scanner(System.in);
		System.out.print("Enter size of array: ");

		size=in.nextInt();

		float arr[]=new float[size];

		System.out.print("\nEnter the array: ");
		for(int i=0;i<size;i++)
		{
			arr[i]=in.nextFloat();
		}

		System.out.print("\nThe reversed array is: ");
		for(int i=size-1;i>=0;i--)
		{
			System.out.print(arr[i]+", ");
		}
		System.out.print(arr[0]);
	}
}