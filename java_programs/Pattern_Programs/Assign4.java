class Assign4 
{
	public static void main(String[] args) 
	{
		int n=5;
		int k=1;
			char ch='a';
		for(int i=0;i<n-1;i++)
		{
	
			for(int j=0;j<n;j++)
			{
				if(j%2==0)
				{
					System.out.print(ch++ +" ");
				}
				else
					System.out.print(k++ +" ");
			}
		System.out.println( );
	}
	}
}
