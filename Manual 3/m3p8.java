class m3p8{
	public static void main(String[] args){
	int num=1;

	for(int i=0;i<4;i++)
	{
		for(int j=0;j<5;j++)
			System.out.print(num*0+" ");

		System.out.println();
	}

	System.out.println();
	System.out.println();

	for(int i=0;i<4;i++)
	{
		for(int j=0;j<5;j++)
		{
			System.out.print(num*i*j+" ");
		}
		System.out.println();
	}

	System.out.println();
	System.out.println();

	for(int i=0;i<4;i++)
	{
		for(int j=0;j<5;j++)
		{
			System.out.print(num*i*j*2+" ");
		}
		System.out.println();
	}

	System.out.println();
}
}