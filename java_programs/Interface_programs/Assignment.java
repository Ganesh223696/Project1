interface Run
{
	public void display();

}
class Walk
{
	public void print()
	{
		System.out.println("walk like a king");
	}
}
class Assign extends Walk implements Run
{
	public void display()
	{
		System.out.println("display the pc");
	}
	public void Run()
	{
		System.out.println("Run");
	}
}
class Assignment
{

	public static void main(String[] args) 
	{
		Assign a1 = new Assign();
		a1.display();
		a1.Run();
		a1.print();

		System.out.println("Hello World!");
	}
}
