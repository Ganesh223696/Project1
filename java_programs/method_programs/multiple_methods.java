/*WAP to create multiple static methods and call from main method*/
class multiple_methods
{
	public static void move() 
	{
		System.out.println("Move 5 km.....");
	}
	public static void fly()
	{
		System.out.println("Fly like a bird...");

}
public static void main(String [] args)
	{
	System.out.println("Exection starts...");
		move();
	fly();
	System.out.println("Execution ends....");
	}
}
