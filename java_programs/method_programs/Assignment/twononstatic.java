/*WAP to print 2 non static metods and call into a main method by creating object*/
class twononstatic 
{
	public void Eat()
	{
		System.out.println("Eat like anything....");
	}
	public static void main(String[] args) 
	{
		System.out.println("Execution starts....");
		twononstatic obj = new twononstatic();
		obj.Eat();
		System.out.println("Execution ends...");
		obj.Act();
	}
	public void Act()
	{
		System.out.println("Act like no one else...");
	}
}
