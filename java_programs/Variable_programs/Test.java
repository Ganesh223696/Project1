/*wap to create non static variable and print the variable in main method*/
class Test
{
	/*non static variable*/
public int g = 99;

	public static void main(String[] args) 
	{
		System.out.println("Execution starts");
				Test obj = new Test();
				System.out.println(obj.g);
				System.out.println("Execution ends");

	}
}
