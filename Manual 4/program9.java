package nit_sem2_LM4;

public class program9 {
    int factorial(int n) {
        if (n == 1)
            return 1;
        return n*factorial(n-1);
    }
    
    public static void main(String...args) {
        program9 p = new program9();
        System.out.println(p.factorial(5));
    }
}
