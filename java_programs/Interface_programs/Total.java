/* a class can extend as well as implenets*/
interface Hi
{
	void wish();
}
abstract class Sing
{
	abstract public void sing();
}
class Int extends Sing implements Hi 
{
	public void wish()
	{
		System.out.println("wish hii");
	}
	public void sing()
	{
		System.out.println("sing a song");
	}
}
class Total
{
	public static void main(String[] args) 
	{
		Int i1=new Int();
		i1.wish();
		i1.sing();
	}
}
