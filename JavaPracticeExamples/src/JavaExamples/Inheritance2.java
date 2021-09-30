package JavaExamples;


abstract class Mobile
{
	public abstract void camera();
	public void music()
	{
		System.out.println("Mobile Music");
	}
}
class OnePlus extends Mobile
{
	@Override
	public void camera() {
		System.out.println("One Plus Camera");
	}
	
}
public class Inheritance2 {

	public static void main(String[] args) {
		
//		Mobile m = new Mobile();//Can't create object for abstract classes
		
		/*OnePlus op = new OnePlus();
		op.camera();
		op.music();*/
		
		Mobile m1 = new OnePlus();
		m1.camera();
		m1.music();

	}

}
