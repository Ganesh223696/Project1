/*wap to check product and summation of a number is equal or not*/
class Ps
{
	public static void main(String[] args) 
	{
		int a=321;
		int pro=1;
		int sum=0;
		int r;
	while(a>0)
		{
		r=a%10;
		pro=pro*r;
		sum=sum+r;
		a=a/10;
		}
		System.out.println(pro);
		System.out.println(sum);
		if(sum==pro)
		{
			System.out.println("its a");
		}
			else{
				System.out.println("its not");
			}
	}
}
