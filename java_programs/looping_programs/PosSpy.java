class PosSpy 
{
	public static void main(String[] args) 
	{
		int pos=12;
		int count=0;
		for(int i=1;i<=i+1;i++)
		{
			int a=i;
			int sum=0;
			int pro=1;
			while(a>0)
			{
				sum=sum+a%10;
				pro=pro*a%10;
				a=a/10;
			}
			if(sum==pro)
			{
				count++;
			}
			if(pos==count)
			{
		System.out.println(i+"is spy");
		break;
			}
	}
}
}
