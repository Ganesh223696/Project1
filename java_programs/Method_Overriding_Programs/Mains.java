class Shapes 
{
	public void rotate()
	{
		System.out.println("rotate clock wise direction..");
	}
}
class Rect extends Shapes
{
	
}
class Circle extends Shapes
{
	public void rotate()
	{
		System.out.println("rotate anti clock wise direction...");
	}
}
class Triangle extends Shapes
{
	
}
class MainS
{
	public static void main(String[] args) 
	{
		new Rect().rotate();
		new Circle().rotate();
		new Triangle().rotate();
	}
}
