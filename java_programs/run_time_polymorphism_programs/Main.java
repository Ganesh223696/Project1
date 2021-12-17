/*program for run time polymorphism by creating an object*/
interface Missile
{
	void move();
}
class Missile1 implements Missile
{
	public void move()
	{
		System.out.println("move from earth to sky...");
	}
}
class Missile2 implements Missile
{
	public void move()
	{
		System.out.println("move from sky");
	}
}
class Missile3 implements Missile

{
	public void move()
	{
		System.out.println("from water...");
	}
}
class Battle
{
	public static void Fight(Missile m)
	{
		m.move();
}
}
class Main
{
	public static void main(String[] args) 
	{
		Battle.Fight(new Missile1());
				Battle.Fight(new Missile2());
		Battle.Fight(new Missile3());

	}
}
