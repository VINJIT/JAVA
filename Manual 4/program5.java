package nit_sem2_LM4;

import java.util.Scanner;

public class program5 {
    public static void main(String...args) {
        int m, p, c, t, mp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students");
        int n = input.nextInt();
        for(int i=0; i<n; i++) {
            System.out.print("Enter marks in mathematics : ");
            m = input.nextInt();
            System.out.print("Enter marks in physics : ");
            p = input.nextInt();
            System.out.print("Enter marks is chemistry : ");
            c = input.nextInt();
            mp = m + p;
            t = m + p + c;
            if(m >= 60 && p >= 50 && c >=40 && t >=200 && mp >= 150)
                System.out.println("Student is eligible for professional course");
            else 
                System.out.println("Student is not eligible for professional course");
        }
    }
}
