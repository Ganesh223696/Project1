/*summation of product between m and n*/
class between 
{
	public static void main(String[] args) 
	{
		int m=5;
		int n=10;
		int sum=0;
		int pro=1;
		while(m<=n)
		{
			sum=sum+m;
			pro=pro*m;
			m++;
		}
		System.out.println(sum);
				System.out.println(pro);

	}
}
