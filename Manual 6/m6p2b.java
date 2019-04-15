import java.util.Scanner;
interface dynamicstack
{
	public void push(int stack[],int i,int size);
	public int pop(int stack[]);
	public void display(int stack[]);
}

class m6p2b implements dynamicstack
{
	int top,x;
	//int stack[]=new int[20];
	m6p2b()
	{
		top=-1;
	}
	public void push(int stack[],int i,int size)
	{
		if(top==size-1)
		{
			System.out.println("Stack full");
		}
		else
			stack[++top]=i;
	}

	public int pop(int stack[])
	{
		if(top==-1)
		{
			System.out.println("Stack Empty");
		}
		else
			x=stack[top--];

		return x;
	}

	public void display(int stack[])
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
		System.out.println("\nEnter size of stack: ");
		int size=in.nextInt();
		int stack[]=new int[size];

		dynamicstack s1=new m6p2b();
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
						s1.push(stack,x,size);
						s1.display(stack);
						break;

				case 2: s1.pop(stack);
						s1.display(stack);
						break;

				default: System.out.println("Invalid Input");
			}
			System.out.println("\nDo You wish to Continue(Y/N)?");
			ch=in.next().charAt(0);
		}while(ch=='y' || ch=='Y');
	}
}