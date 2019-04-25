#include<stdio.h>
void generate(int n)
{
	int square[3][3]={0,0,0,0,0,0,0,0,0};
	int i=n/2;
	int j=n-1;
	for(int num=1;num<=n*n;)
	{
		if(i==-1 && j==n)
		{
			i=2;
			j=n-2;
		}
		else
		{
			if(j==n)
			{
				j=0;
			}
			if(i<0)
			{
				i=2;
			}
		}
		if(square[i][j]!=0)
		{
			if(i==1)
			{
				i=0;
				j=1;
				continue;
			}
			else if(i==0)
			{
				i=2;
				j=0;
				continue;
			}
		}
		else
		{
			square[i][j]=num++;
		}
		j++;
		i--;
	}
	printf("the magic square will be \n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			printf("%d",square[i][j]);
		}
		printf("\n");
	}
}

int main()
{
	int n=3;
	generate(n);
	return 0;
}
