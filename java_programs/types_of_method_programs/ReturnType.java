class ReturnType 
{
public static String move1()
	{
	return "hie";
	}
	public int move2()
	{
		return 99;
	}
	public static void main(String[] args) 
	{
		String s = move1();
		ReturnType obj = new ReturnType();
		int i = obj.move2();
		
		System.out.println("Hello World!"+i+s);
	}
}
