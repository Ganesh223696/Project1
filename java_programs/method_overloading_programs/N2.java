/*non static method to static variable*/
class N2
{
		public  static int a = 100;

	public void add()
	{
		/*non static method access sttaic variable directly*/
				System.out.println(a);
						

	}
	public static void main(String[] args) 
	 {
		N2 k=new N2();
	k.add();
	
	}
}
