class P 
{
	public int i = 4;
}
class Q extends P
{
 public double j =4.8;
	public void info()
	{
		System.out.println("value of i:"+i);
		System.out.println("value of j :"+j);
	}
}
	class R extends P 

	{
		public double k = 8.9;
	public void print()
	{
		System.out.println("value of i :"+i);
		System.out.println("value of k:"+k);
	}
	}
	class PQRMain
	{
	public static void main(String[] args) 
	{
   /*  Q q1 = new Q();
	 R r1 = new R();
	 q1.info();
	 r1.print();*/
	new Q().info();
	new R().print();
	}
}
