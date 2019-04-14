package nit_sem2_LM2;

public class program7 {
    public static void main(String[] args) {
      int a[]= {3,5,2,10,0};
            int temp;
            for(int i=0; i<5; i++) {
                for(int j=0; j<5-i-1; j++) {
                    if(a[j]>a[j+1]) {
                        temp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;
                    }
                }
            }
            
            for(int i=0; i<5; i++)
                System.out.println(a[i]+" ");
    }       
}
