// wap to check whether given number is panlindrome number or not  
class pal 
{
	public static void main(String[] args) 
	{
		int n=14591;
		int rev=0;
		int temp=n;
		while(n>0)

		{
			rev=rev*10 +n%10;
			n=n/10;
		}
			System.out.println(rev);

	if(rev==temp)
		{
				System.out.println("its a");
		}
		else
		{
		System.out.println("its not");
		}
	}
}
