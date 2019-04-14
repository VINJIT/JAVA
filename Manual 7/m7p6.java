class producer extends Thread {
	critical t;
	producer(critical t)
	{
		this.t=t;
	}
	public void run()
	{
		t.producerConsumer();
	}
}

class consumer extends Thread {
	critical t;
	consumer(critical t)
	{
		this.t=t;
	}
	public void run()
	{
		t.producerConsumer();
	}
}

 class critical {
	synchronized void producerConsumer() {
		for(int i=1;i<=4;i++)
		{
			System.out.println(Thread.currentThread() + " " + i);

			try{
				Thread.sleep(500);
			}catch(InterruptedException e){ System.out.print(e);}
		}
	}
}

class m7p6
{
	public static void main(String[] args) {
		critical cr=new critical();
		producer p = new producer(cr);
		consumer c = new consumer(cr);
		p.start();
		c.start();
	}
}