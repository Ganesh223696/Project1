class Neon 
{
	public static void main(String[] args) 
	{
		int n=9;
		int sum=0;
		int sq=n*n;
		while(sq>0)
		{
			sum=sum+sq%10;
			sq=sq/10;
		}
		if(sum==n)
		{
		System.out.println(n+"is a neon number");
		}
		else{
			System.out.println(n+"is not a neon number");
		}
	}
}
