/*call static non static method print static non static variable from main method*/
class Five 
{
	public static void fix()
	{
		System.out.println("Fly like a bird....");
	}
      public void ride()
	{
	System.out.println("ride to enjoy...");
	}
	public static int a =100;
	public int b = 200;
	public static void main(String[] args) 
	{

		System.out.println("starts.....");
		fix();
		Five obj = new Five();
		obj.ride();

		System.out.println(a);
		System.out.println(obj.b);
	}
}
