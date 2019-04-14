import java.util.Scanner;
 
public class m8p3
{
   public static void main(String[] args)
   {
      String temp;

      Scanner sc = new Scanner(System.in);

      System.out.print("How many names are there? :");
      int n=sc.nextInt();

      String arr[]=new String[n];

      Scanner s = new Scanner(System.in);
      System.out.print("Enter the Names:");
      for(int i=0;i<n;i++)
      {
      	arr[i]=s.nextLine();
      } 

      for(int i=0;i<n;i++)
      {
      	for(int j=i+1;j<n;j++)
      	{
      		if(arr[i].compareTo(arr[j])>0)
      		{
      			temp=arr[i];
      			arr[i]=arr[j];
      			arr[j]=temp;
      		}
      	}
      }

      System.out.println("\n\nSorted list of names is: ");
      for(int i=0;i<n;i++)
      {
      	System.out.print(arr[i]+", ");
      }
  }
}