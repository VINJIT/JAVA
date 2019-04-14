import java.util.Scanner;
 
class m8p2
{
   public static void main(String args[])
   {
      String str, rev = "";
      Scanner sc = new Scanner(System.in);
 
      System.out.print("Enter a string: ");
      str = sc.nextLine();

      System.out.print("Enter the character to remove: ");
      char ch=sc.next().charAt(0);

      int len=str.length();

      str=str.replace(ch,' ');

      System.out.println("New string is: "+str);
     }
 }