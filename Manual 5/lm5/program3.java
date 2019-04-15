import package1.program3Package;

class AccessSpecifiers {
	private int i=10;
	int j = 20;
	protected int k = 30;
	public int l = 40;
	
	void sameClass() {
		System.out.println("Same Class i = " + i);
		System.out.println("Same Class j = " + j);
		System.out.println("Same Class k = " + k);
		System.out.println("Same Class l = " + l);
	}
}

class SubClass extends AccessSpecifiers {
	void SubClassDisplay() {
		System.out.println("Sub Class i = " + i);
		System.out.println("Sub Class j = " + j);
		System.out.println("Sub Class k = " + k);
		System.out.println("Sub Class l = " + l);
	}
}

class DPSubClass extends program3Package {
	void DPSubClassDisplay() {
		System.out.println("Different Package Sub Class x = " + x);
		System.out.println("Different Package Sub Class y = " + y);
		System.out.println("Different Package Sub Class z = " + z);
		System.out.println("Different Package Sub Class xa = " + xa);
	}
}


class MainClass {
	public static void main(String...args) {
		SubClass s = new SubClass();
		s.SubClassDisplay();
		
		AccessSpecifiers a = new AccessSpecifiers();
		a.sameClass();
		System.out.println("Same Package Non SubClass i = " + a.i);
		System.out.println("Same Package Non SubClass j = " + a.j);
		System.out.println("Same Package Non SubClass k = " + a.k);
		System.out.println("Same Package Non SubClass l = " + a.l);
		
		DPSubClass dps = new DPSubClass();
		dps.DPSubClassDisplay();
		
		program3Package ac = new program3Package();
		System.out.println("Different Package Non Sub Class x = " + ac.x);
		System.out.println("Different Package Non Sub Class y = " + ac.y);
		System.out.println("Different Package Non Sub Class z = " + ac.z);
		System.out.println("Different Package Non Sub Class xa = " + ac.xa);

	}
}