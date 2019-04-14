class first extends Thread
{
	public void run()
	{
		for(int i=1;i<=4;i++)
		{
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){ System.out.print(e);}

			System.out.println("Good morning");
		}
	}
}

class second extends Thread
{
	public void run()
	{
		for(int i=1;i<=4;i++)
		{
			try{
				Thread.sleep(200);
			}catch(InterruptedException e){ System.out.print(e);}

			System.out.println("Hello");
		}
	}
}

class third extends Thread
{
	public void run()
	{
		for(int i=1;i<=4;i++)
		{
			try{
				Thread.sleep(300);
			}catch(InterruptedException e){ System.out.print(e);}

			System.out.println("Welcome");
		}
	}
}
	
class m7p3
{
	public static void main(String[] args) {
		
		first t1=new first();
		second t2=new second();
		third t3=new third();

		t1.start();
		t2.start();
		t3.start();		
	}	
}