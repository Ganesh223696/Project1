class M 
{
	public double i=5.6;
		public static String t ="gani";

}
class N extends M

{
	public int j = 7;
	public static String s ="gani";
}
class O extends N
{
	public int k=8;
	public void display()
	{
		System.out.println("value of i is:"+i);
		System.out.println("value of j is:"+j);
		System.out.println("value of k is:"+k);
				System.out.println("name:"+N.s);
				System.out.println("name:"+t);

   }
}
class Mainmno
{
	public static void main(String[] args) 
	{
		/*O o1 = new O();
		o1.display();*/
		new O().display();
	}
}
