/*print local variables within the method*/
class Variables 
{
	public static void win()
	{
		int a = 100;
		System.out.println(a);
	}
	public void fix()
	{
		double b = 0.5;
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
	win();
     Variables obj = new Variables();
     obj.fix();
	}
}
