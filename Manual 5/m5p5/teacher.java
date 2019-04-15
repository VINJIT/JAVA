package two;
import one.*;

class teacher extends person{

	 public static void main(String[] args) {
		person ob=new person();
		ob.setname("Vinjit");
		ob.setage(21);
		ob.setgender("Male");
		student ob1=new student();
		ob1.setIdNum(61);
		ob1.setGPA(9);

		System.out.println(ob.getname());
		System.out.println(ob.getage());
		System.out.println(ob.getgender());
		System.out.println(ob1.getIdNum());
		System.out.println(ob1.getGPA());
	}
}