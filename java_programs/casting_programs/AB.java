/*wap for single level inheritance ,method overriding,upcasting and then call the method*/
class C 
{
	 public void move()
	{
		System.out.println("movee...");
	}
}
	class D extends C
	{
		public void move()
		{
			System.out.println("move fast...");
		}
		public void walk()
		{
			System.out.println("walk....");
		}
	}
	class AB
	{

	public static void main(String[] args) 
	{
		C c1= new D();
		c1.move();
	}
}
