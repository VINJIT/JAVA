package one;

public class student extends person{

	int id,gpa;
	public void setIdNum(int id)
	{
		this.id=id;
	}

	public void setGPA(int gpa)
	{
		this.gpa=gpa;
	}

	public int getIdNum()
	{
		return this.id;
	} 

	public int getGPA()
	{
		return this.gpa;
	} 

}