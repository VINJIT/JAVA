package nit_sem2_LM5;

class Employee {
    int x = 40000;
	
	void DisplayIncome() {
		System.out.println("Income of employee is " + x);
	}
}

class Marketer extends Employee {
    void advertise() {
        System.out.println("Act now, while supplies last!");
    }
	
	void DisplayIncome() {
		System.out.println("Income of manager is " + (super.x+10000));
		advertise();
	}
}

class MainClass {
    public static void main(String...args) {
        Employee e1 = new Employee();
		e1.DisplayIncome();
		Marketer m1 = new Marketer();
		m1.DisplayIncome();
        
    }
}


//javac -d . filename.java
//java pkgname.filename
