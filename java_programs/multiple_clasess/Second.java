
/*wap to create two classes in a single file, 1st class consists of static method and non static method
2:class consists of main method which will call static and non static method of 1st class*/
class Sample

{
	public static void add()
	{
		int b = 55;
		System.out.println(b);

	}
	public void add1()
	{
		double d = 6.8;
		System.out.println(d);
	}
}
	class Second
	{
	public static void main(String[] args) 
	{
	Sample.add();
		Sample s1 = new Sample();
	s1.add1();
	}
}


