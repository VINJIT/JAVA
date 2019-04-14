package nit_sem2_LM4;

public class program3 {
    int numUnique(int a, int b, int c) {
        if(a==b && b==c && c==a)
            return 1;
        else if(a==b || b==c || c==a)
            return 2;
        else 
            return 3;
    }
    
    public static void main(String...args) {
        program3 p = new program3();
        System.out.println("Number of unique number is : " + p.numUnique(1,2,3));       
    }
}
