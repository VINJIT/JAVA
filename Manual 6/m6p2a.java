import java.util.Scanner;
interface staticstack
{
	public void push(int i);
	public int pop();
	public void display();
}

class m6p2a implements staticstack
{
	int top,x;
	int stack[]=new int[20];
	m6p2a()
	{
		top=-1;
	}
	public void push(int i)
	{
		if(top==20)
		{
			System.out.println("Stack full");
		}
		else
			stack[++top]=i;
	}

	public int pop()
	{
		if(top==-1)
		{
			System.out.println("Stack Empty");
		}
		else
			x=stack[top--];

		return x;
	}

	public void display()
	{
		System.out.println("Current stack is: ");
		for(int i=top;i>=0;i--)
		{
			System.out.println(stack[i]);
		}
	}

	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int x;
		char ch;
		staticstack s1=new m6p2a();
		do{
			System.out.println("********Menu********\n\n");
			System.out.println("Press 1 to Push elements");
			System.out.println("\nPress 2 to Pop elements");
			System.out.println("\n Enter choice: ");
			
			int op=in.nextInt();
			switch(op)
			{
				case 1:	System.out.println("Enter the Element");
						x=in.nextInt();
						s1.push(x);
						s1.display();
						break;

				case 2: s1.pop();
						s1.display();
						break;

				default: System.out.println("Invalid Input");
			}
			System.out.println("\nDo You wish to Continue(Y/N)?");
			ch=in.next().charAt(0);
		}while(ch=='y' || ch=='Y');
	}
}