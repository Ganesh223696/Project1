/*wap to perform multiplication in 3 ways and return the result,all the methods must be non static,call the methods from main method,receive the result,and print the result in main method */
class  Multiplication
{
	public int multiply(int i,int j)
	{
	
	return i*j;
	}
	public double multiply(double i , double j)
	{

		return i*j;
	}
	public double multiply(int i,double j)
	{
				
				return i*j;
	}


	public static void main(String[] args) 
	{
		System.out.println("starts....");
		Multiplication obj = new Multiplication();
		int a = obj.multiply (5,5);
		double k = obj.multiply (2.2,4.2);
		double l = obj.multiply(3,4.5);
				System.out.println(a);
		System.out.println(k);
		System.out.println(l);

				System.out.println("ends...");

	}
}
