/*Number of ways to access static memebers*/
class Test 
{
	public static double a = 5.5;
	public static void main(String[] args) 
	{
		System.out.println("Exe starts....");
				System.out.println(a);
		System.out.println(Test.a);
		Test t1 = new Test();
		System.out.println(t1.a);

	}
}
