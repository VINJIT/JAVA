/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nit_sem2_LM4;

/**
 *
 * @author Lenovo
 */
public class program2 {
      public static void stars() {
       for(int i=1; i<=10; i++) {
           for(int j=1; j<=i; j++) {
               System.out.print("*");
           }
           for(int j=1; j<=20-2*i; j++) {
               System.out.print(" ");
           }
           for(int j=1; j<=i; j++) {
               System.out.print("*");
           }
           System.out.print("*");
       }
    }
    
    public static void main(String args[]) {
        program2 p = new program2();
        p.stars();
    }
}
