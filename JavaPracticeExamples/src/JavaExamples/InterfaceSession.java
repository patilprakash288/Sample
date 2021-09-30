package JavaExamples;

interface Mobile1
{
	public void camera();
	public void music();
}

class Mi implements Mobile1
{
	public void camera()
	{
		System.out.println("Mi Camera");
	}
	public void music()
	{
		System.out.println("Mi Music");
	}
	public void screenSize()
	{
		System.out.println("Mi Screensize");
	}
}

public class InterfaceSession {

	public static void main(String[] args) {
		
//		Mobile1 m = new Mobile1();//Can't create object for interfaces
		
		/*Mi mi1 = new Mi();
		mi1.camera();
		mi1.music();*/
		
		Mobile1 m1 = new Mi();
		m1.camera();
		m1.music();


	}

}
