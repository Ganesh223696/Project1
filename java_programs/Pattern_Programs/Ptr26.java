class Ptr26 
{
	public static void main(String[] args) 
	{
		int n=25;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0||j<n/2&&j==i||((j>=n/2)&&(i+j==n))||j==n-1)
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
		System.out.println();
	}
	}
}
