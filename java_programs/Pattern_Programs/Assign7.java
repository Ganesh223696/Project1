class Assign7 
{
	public static void main(String[] args) 
	{
		int n=4;
			int k=1;
		char ch='a';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j%2==0)
				{
				System.out.print(k +" ");
			k=k+3;
			}
			else
				{
				System.out.print(ch +" ");
			ch=(char)(ch+3);
				}
		}

		System.out.println( );
	}
}
}