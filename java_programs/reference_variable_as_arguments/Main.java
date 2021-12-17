class Shape 
{
	public void rotate()
	{
		System.out.println("rotate");
	}
}
class Circle extends Shape
{
	public void fill()
	{
		System.out.println("fill the circle");
	}
}
class Rect extends Shape
{
	public void erase()
	{
		System.out.println("erase a box..");
}
}
class Tri extends Shape
{
	public void draw()
	{
		System.out.println("draw a triangle..");
	}
}
class CAD
{
	public static void design(Circle c1)
	{
		c1.rotate();
		c1.fill();
	}
	public static void display(Rect r1)
	{
		r1.rotate();
		r1.erase();
	}
	public static void print(Tri t1)
	{
		t1.rotate();
		t1.draw();
}
}
class Main
{
	public static void main(String[] args) 
	{
		    CAD.design(new Circle());
			CAD.display( new Rect());
			CAD.print ( new Tri());

		System.out.println("Hello World!");
	}
}
