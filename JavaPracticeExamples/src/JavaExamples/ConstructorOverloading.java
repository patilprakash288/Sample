package JavaExamples;

import java.util.Scanner;

class Addition
{
	int a, b, c;
	public Addition()
	{
		a=14;
	}
	public Addition(int b, int c)
	{
		this();
		this.b=b;
		this.c=c;
	}
	public void addition()
	{
		System.out.println(a+b+c);
	}
}


public class ConstructorOverloading {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter value for b: ");
		int b = scn.nextInt();
		System.out.println("Enter value for c: ");
		int c = scn.nextInt();
		
		Addition a = new Addition(b,c);
		a.addition();	
		scn.close();
	}

}
