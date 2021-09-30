package JavaExamples;

class Parent
{
	public Parent()
	{
		System.out.println("Parent Default Constructor");
	}
	public Parent(String message)
	{
		this();
		System.out.println(message);
	}
}

class Child extends Parent
{
	public Child()
	{
		this("Calling Child Parametrized Constructor");
		System.out.println("Child default Constructor");
	}
	public Child(String message)
	{
		super("Calling Parent Parametrized Constructor");
		System.out.println(message);
	}
}

public class SuperConcept {

	public static void main(String[] args) {
		
		Child c = new Child();
		System.out.println(c);
		

	}

}
