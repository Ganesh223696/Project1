class A 
{
	public static int k = 7;
}
class B 
{
	public int j=30;
	public void test()
	{
		/*System.out.println("value of i is:"+i);*/
		System.out.println("value of j is :"+j);
		System.out.println("value of k:"+A.k);
	}
}
class MainAB
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.test();
	}
}
