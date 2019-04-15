import java.util.*;
interface area{
	public double circle(double r);
	public int rectangle(int l, int b);
}

class m6p1 implements area{

	
	public double circle(double r)
	{
		return 3.14*r*r;		
	}

	public int rectangle(int l,int b)
	{
		return l*b;
	}

	public static void main(String [] args)
	{
		area ob=new m6p1();
		System.out.println("Area of circle is "+ob.circle(5.0));

		System.out.println("Area of rectangle is "+ob.rectangle(10,5));
	}
}