import java.util.Scanner;
 
class m8p4
{
   public static void main(String args[])
   {
      String str;
      int count=0;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the Sentence:");
      str=sc.nextLine();

      String[] words = str.split("\\s+");
   	  count= words.length;
 

      System.out.print("Numbers of words are: "+count);
    }
}