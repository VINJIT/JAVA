//package nit_sem2_LM6;

interface Area {
	void areaCircle(int r);
	void areaRectangle(int l, int b);
}

class CircleRectangle implements Area {
	public void areaCircle(int r) {
		System.out.println("Area of Circle is : " + 3.14*r*r);
	}
	
	public void areaRectangle(int l, int b) {
		System.out.println("Area of Rectangle is : " + l*b);
	}
}

class mainClass {
	public static void main(String...args) {
		Area a = new CircleRectangle();
		a.areaCircle(7);
		a.areaRectangle(5,10);
	}
}