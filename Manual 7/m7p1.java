class m7p1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){ System.out.print(e);}

			System.out.println("worker id: "+getId()+": "+i);
		}
	}

	public static void main(String[] args) {
		
		m7p1 []t;
		t=new m7p1[5];
		
		for(int i=0;i<5;i++)
			t[i]=new m7p1();
		for(int i=0;i<5;i++)
			t[i].start();
		
			}
}