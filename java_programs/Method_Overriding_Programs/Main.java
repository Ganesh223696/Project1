class Demo 
{
	public void move()
	{
		System.out.println("move north...");
	}
}
class Sample extends Demo

{
	public void move()
	{
		System.out.println("move south.....");
	}
}
class Main
{
	public static void main(String[] args) 
	{
		new Sample().move();
	}
}
