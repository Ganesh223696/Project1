/*pgm for abstract*/
abstract class A 
{
	abstract  public void test();
}
class B extends A
{
	public void test()
	{
		System.out.println("test a car.....");
}
}
class main
{
	public static void main(String[] args) 
	{
		new B().test();
	}
}
