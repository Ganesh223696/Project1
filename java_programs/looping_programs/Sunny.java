class Sunny 
{
	public static void main(String[] args) 
	{
		int n=35;
		int sum=n+1;
		boolean ischeck=false;
		for(int i=1;i<=sum;i++)
		{
			if(i*i==sum)
			{
				ischeck=true;
				break;
			}
		}
		if(ischeck==true)
		{
		System.out.println(n+"is a sunny number");
		}
		else{
			System.out.println(n+"is not a sunny number");
	}}
}
