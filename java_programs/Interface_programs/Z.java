/*one class can extends another class and implenents interface*/
interface U
{
	void play();
}
class V
{
	public void drink()
	{
		System.out.println("drink water...");
	}
}
class Y extends V implements U
{
	public void play()
	{
		System.out.println("play a cricket");
	}
}
class Z
{
	public static void main(String[] args) 
	{
		Y y1= new Y();
		y1.play();
		y1.drink();
	}
}
