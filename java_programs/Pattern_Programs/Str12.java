/*assign3*/
class Str12 
{
	public static void main(String[] args) 
	{
		int n=5;
		int k=1;
		char ch='A';
		for(int i=0;i<n;i++)
		{
	
		for(int j=0;j<n;j++)
			{
			if(j==0 || j==n-1)
				{
				System.out.print(ch++ +" ");
				}
				else if(j==n/2)
				{
				System.out.print(" + ");
				}
				else
				System.out.print(k++ +" ");
		}
		System.out.println( );
	}
	}
}
