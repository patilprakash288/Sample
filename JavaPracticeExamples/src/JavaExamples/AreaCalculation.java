package JavaExamples;

import java.util.Scanner;


class Area
{
	int l,b;
	public Area(int l, int b) {
		this.l=l;
		this.b=b;
	}
	/*public Area()
	{
		l=25;
		b=50;
	}*/
	public void area()
	{
		System.out.println("Area = " + l*b);
	}
}

public class AreaCalculation {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter value for l: ");
		int l = scn.nextInt();
		System.out.println("Enter value for b: ");
		int b = scn.nextInt();
		Area a = new Area(l,b);
		a.area();
		scn.close();

	}
	
}

