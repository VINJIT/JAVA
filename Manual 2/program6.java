package nit_sem2_LM2;

import java.util.Scanner;

public class program6 {
        public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          double a = input.nextDouble();
          double b = input.nextDouble();
          double sum=0;
          //for(int i=0; i<args.length; i++) {
          //    sum+= a[i];
          sum = a + b;
          System.out.println("Sum of "+a+" and "+b+" is "+sum);
        }
}
