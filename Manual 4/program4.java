package nit_sem2_LM4;

public class program4 {
    public static void main(String...args) {
        int a[]={23,23,4,59,60};
        int p=0, q=0, r=0, s=0;
        for(int i=0; i<a.length; i++) {
            if(a[i] > 80 && a[i] <= 100)
                p++;
            else if(a[i] > 60 && a[i] <= 80)
                q++;
            else if(a[i] > 40 && a[i] <= 60)
                r++;
            else if(a[i] >= 0 && a[i] <= 40)
                s++;
        }
        System.out.println("Number of students having marks between 80 and 100 is "+ p);
        System.out.println("Number of students having marks between 60 and 80 is "+ q);
        System.out.println("Number of students having marks between 40 and 60 is "+ r);
        System.out.println("Number of students having marks between 0 and 40 is "+ s);
    }
}
