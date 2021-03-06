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
/*cad is for specialized method*/
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
/*cad1 for generalized method*/
class CAD1
{
	public static void info(Shape s1)
	{
		s1.rotate();
		if(s1 instanceof Circle)
		{
			Circle c1=(Circle)s1;
			c1.fill();
		}
		else if(s1 instanceof Rect)
		{
			Rect r1=(Rect)s1;
			r1.erase();
		}
		else if(s1 instanceof Tri)
		
		{
			Tri t1=(Tri)s1;
		t1.draw();
	}
	}

}
class Main1 
{
	public static void main(String[] args) 
	{
		System.out.println("...........calling specialized method.....");
		CAD.design(new Circle());
		CAD.display(new Rect());
		CAD.print(new Tri());
		System.out.println(".....calling generalized method......");
		CAD1.info(new Circle());
		CAD1.info(new Rect());
		CAD1.info(new Tri());


	}
}
