/*Non Static method directly access static method*/
class Nsm 
{
	public void non()
	{
		System.out.println("non like no one ");
		act();
	}
	public static void act()
	{
		System.out.println("act to gain popularity");
	}
	public static void main(String[] args) 
	{
	Nsm n1 = new Nsm();
		n1.non();
		System.out.println("Hello World!");
	}
}
