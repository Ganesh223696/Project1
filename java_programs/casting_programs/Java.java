/*wap abstract class with abstract method implement the method perform upcasting & call the method*/
abstract class Hi
{ 
	abstract public void test();
}
class Bye extends Hi
{
	public void run()
	{
		System.out.println("run a program");
	}
	public void test()
	{
		System.out.println("test a car");
	}
}
class Java
{
	public static void main(String[] args) 
	{
		Hi h1 = new Bye();
		h1.test();
	}
}
/*after declaring a abstract class the method is incomplete and 
the sub class extends the super class the implementation is completed here when we perform upcasting we get the completed method output*/
