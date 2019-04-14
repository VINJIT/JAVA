package nit_sem2_LM2;

public class program8 {
    public static void main(String[] args) {
     int a[]= {3,5,2};
            int max = a[0];
			for(int i=1; i<a.length; i++)
				if(a[i] > max)
					max = a[i];
            
            System.out.println("Greatest number is "+max);
        
    }
}
