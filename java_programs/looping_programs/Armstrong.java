/*wap to print armstrong number*/
class Armstrong 
{
	public static void main(String[] args) 
	{
		int n=153;
		int sum=0;
		int count=0;
		int temp=n;
		int check=n;
		while(n>0)
		{
			count++;
				n=n/10;
		}
		while(temp>0)
		{
			int rem=temp%10;
			int prod=1;
		for(int i=1;i<=count;i++)
		{
			prod=prod*rem;
		}
		sum=sum+prod;
		temp=temp/10;
		}
	if(sum==check)
	{
		System.out.println(check+"is a amstrong number");
	}
	else
		{
		System.out.println(check+"is not a amstrong number");
	}
}
}
