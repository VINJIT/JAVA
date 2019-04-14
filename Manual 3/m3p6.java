class m3p6{
	 public static void main(String[] args) {
		
		int sum=0,temp;

		System.out.print("The numbers divisible by 7 between 100 and 200 are: ");
		for(int i=101;i<=200;i++)
		{
			if(i%7==0)
			{
				sum=sum+i;
				System.out.print(i+", ");
			}
		}

		System.out.print("\n\nSum of these numbers is: "+sum);

	}
}

		
