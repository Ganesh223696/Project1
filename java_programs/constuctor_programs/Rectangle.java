class Rectangle 
{
	public int length;
	public int width;
	Rectangle(int length,int width)
	{
		this.length=length;
		this.width=width;
	}
	public int calculate()
	{
		return length*width;
	}
	public void display()
	{
		System.out.println("length is:"+length);
		System.out.println("width is:"+width);
		System.out.println("caluculate:"+calculate());
	}
	class mainclass
	public static void main(String[] args) 
	{
		Rectangle r1= new Rectangle(5,8);
		r1.display();

	}
}
