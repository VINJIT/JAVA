import java.util.Scanner;
class m10p4
{
	public static void main(String[] args) {

		int temp,turn=0,wait=0;
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter number of processes: ");
		int size=inp.nextInt();
		int process[]=new int[size];
		int arrival[]=new int[size];
		int burst[]=new int[size];
		int tat[]=new int[size];
		int wt[]=new int[size];


		for(int i=0;i<size;i++)
		{
			process[i]=i+1;
			System.out.println("\nProcess "+(i+1));
			System.out.print("Enter arrival time: ");
			arrival[i]=inp.nextInt();
			System.out.print("Enter burst time: ");
			burst[i]=inp.nextInt();
		}

		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
				if(arrival[j]>arrival[j+1])
				{
					temp=arrival[j];
					arrival[j]=arrival[j+1];
					arrival[j+1]=temp;

					temp=process[j];
					process[j]=process[j+1];
					process[j+1]=temp;

					temp=burst[j];
					burst[j]=burst[j+1];
					burst[j+1]=temp;
				}
			}
		}

		wt[0]=0;
		for(int i=0;i<size;i++)
		{
			turn+=burst[i];
			tat[i]=turn;
			if(i<size-1)
			{
				wt[i+1]=turn;
				wait+=turn;
			}
		}
		turn=0;
		for(int i=0;i<size;i++)
		{
			turn+=tat[i];
		}
		float avtat=(float)turn/size;
		float avwt=(float)wait/size;
		System.out.println("\n\nProcess\tArrival time\tBurst Time\tWaiting time\tTurnaround Time");
		for(int i=0;i<size;i++)
		{
			System.out.println(process[i]+"\t\t"+arrival[i]+"\t\t"+burst[i]+"\t\t"+wt[i]+"\t\t"+tat[i]);
		}


		System.out.println("Average Turnaround Time is: "+avtat);		
		System.out.println("Average Waiting Time is:"+avwt);
	}
}