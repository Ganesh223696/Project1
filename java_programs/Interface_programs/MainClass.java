/*interface class using hierarichal inheritance*/
interface Sample1 
{
	void add();
}
 class add1 implements Sample1
 {
	 public void add()
	 {
		 System.out.println("hi");
	 }
	 public void sub()
	 {
		 System.out.println("subbbb");
	 }
 }
 class add2 implements Sample1
 {
	 public void add()
	 {
	 System.out.println("byeeeeeeeeeeee");
 }
 public void div()
 {
	 System.out.println("divvvv");
 }
 }
 class MainClass
 {
	public static void main(String[] args) 
	{
		add1 a1=new add1();
		add2 a2 = new add2();
		a1.add();
		a1.sub();
		a2.add();
		a2.div();
	}
}
