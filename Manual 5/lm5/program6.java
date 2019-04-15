abstract class Shape {
	abstract void area();
}

class Triangle extends Shape {
	int a=3, b=5, c=4;
	void area() {
		int sp = (a+b+c)/2;
		double result = Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
		System.out.println("Area of Triangle is " + result);
	}
}

class Rectangle extends Shape {
	int l=10, b=20;
	void area() {
		System.out.println("Area of Rectangle is " + l*b);
	}
}

class Circle extends Shape {
	int r=7;
	void area() {
		System.out.println("Area of Circle is " + 3.14*r*r);
	}
}

class program6 {
	public static void main(String...args) {
		Triangle t = new Triangle();
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		t.area();
		r.area();
		c.area();
	}
}