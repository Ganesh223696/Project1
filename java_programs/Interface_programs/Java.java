interface Mu
{
	void multi();
}
interface Ad 
{
	void add();
}
interface Sub extends Ad,Mu
{
	void sub();
}
class Extend implements Sub
{
	public void multi()
	{
		System.out.println("do multiplication");
	}
	public void add()
	{
		System.out.println("do addition");
	}
	public void sub()
	{
		System.out.println("do sub");
	}
}
class Java
{
	public static void main(String[] args) 
	{
		Extend e1 = new Extend();
		e1.multi();
		e1.add();
		e1.sub();
		System.out.println("Hello World!");
	}
}
