package JavaExamples;

class Car
{
	public void carModel()
	{
		System.out.println("Car Model");
	}
	public void carCC()
	{
		System.out.println("Car CC");
	}
}
class BMW extends Car
{
	public void carModel()
	{
		System.out.println("BMW Model");
	}
	public void wheels()
	{
		System.out.println("BMW Wheels");
	}
}
class Audi extends Car
{
	public void wheels()
	{
		System.out.println("Audi Wheels");
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		
		/*Car c1 = new Car();
		c1.carCC();
		c1.carModel();*/
		
		/*BMW b1 = new BMW();
		b1.carCC();
		b1.carModel();
		b1.wheels();*/
		
		/*Audi a1 = new Audi();
		a1.carCC();
		a1.carModel();
		a1.wheels();*/
		
		/*Car c2 = new BMW();//Up Casting
		c2.carCC();
		c2.carModel();*/
		
		/*BMW b2 = (BMW) new Car();//Down Casting
		b2.carCC();
		b2.carModel();
		b2.wheels();*/

	}

}
