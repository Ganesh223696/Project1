/*wap for below requirements 
1. a car moving at the speed of 120km/hr and it has covered a distance of 600km,calculate the time taken by the car
2.develop a separate method to calculate the time , take speed and distance as parameters , return the time taken*/
class Reqirements
{


	public static double car(int spee, int dist)
	{
	  return dist/spee;
	}
	public static void main(String[] args) 
	{
		 double a=car(120,600);
		System.out.println(a);
	}
}
