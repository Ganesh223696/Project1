/*wap to check whether the given number is perfectsquareroot or not*/
class PerfectsquareRoot 
{
	public static void main(String[] args) 
	{
		int n=56;
		boolean ischeck=false;
		for(int i=1;i<n;i++)
		{
			if(i*i==n)
			{
				ischeck=true;
				break;
			}
		}
		if(ischeck==true)
		{
			System.out.println(n+"is a perfect square root");
		}
		else
		{
			System.out.println(n+"is not a perfect square root");
		}
	}
}
