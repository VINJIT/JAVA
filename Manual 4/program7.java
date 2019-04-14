package nit_sem2_LM4;

class Addition {
    int add(int x, int y){
        return x + y;
    }
    
    double add(double x, double y) {
        return x + y;
    }
    
    String add(String x, String y) {
        return x + y;
    }
    
    int[] add(int[] x) {
        for(int i=0; i<x.length; i++)
            x[i] = x[i]+1;
        
        return x;
    }
    
    public static void main(String...args) {
        int x[]={1,2,3,4,5};
        Addition a = new Addition();
        System.out.println(a.add(2,3));
        System.out.println(a.add(2.0,5.0));
        System.out.println(a.add("Hello"," World!"));
        x = a.add(x);
        for(int i=0; i<x.length; i++)
            System.out.print(x[i] + " ");
    }
}
