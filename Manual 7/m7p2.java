class m7p2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=4;i++)
		{
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){ System.out.print(e);}

			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		m7p2 []t;
		t=new m7p2[2];
		
		for(int i=0;i<2;i++)
			t[i]=new m7p2();
		for(int i=0;i<2;i++)
			t[i].start();
		
			}
}