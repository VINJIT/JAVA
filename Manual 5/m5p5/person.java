package one;

public class person{
	String name, gender;
	int age;

	public void setname(String name)
	{
		this.name=name;
	}

	public void setage(int age)
	{
		this.age=age;
	}

	public void setgender(String gender)
	{
		this.gender=gender;
	}

	public int getage()
	{
		return this.age;
	}

	public String getgender()
	{
		return this.gender;
	}

	public String getname()
	{
		return this.name;
	}
}