/*wap to reverse a number*/
class Reverse 
{
	public static void main(String[] args) 
	{
		int n=658;
		int rev=0;
		int temp=n;
		while(n>0)
		{
			rev=rev*10+n%10;
			n=n/10;
		}
		System.out.println("reverse of "+temp+"is"+" "+rev);
	}
}
