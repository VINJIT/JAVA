package PersonStudent;

public class Person {
	String name;
	int age;
	char gender;
	
	public Person() {
		name = "Shivam singh";
		age = 22;
		gender = 'M';
	}

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}	
}

class Student extends Person {
	int id, gpa;
	public Student() {	}
	
	int getIdNum() {
		return id;
	}
	int getGPA() {
		return gpa;
	}
	
	void setIdNum(int id) {
		this.id = id;
	}
}