package constructor;
class A
{
	private int x;
	private int y;
	A()
	{
		x=100;
		y=200;
	}
	void print()
	{
		System.out.println(x);
		System.out.println(y);	
	}
}
public class Basic {

	public static void main(String[] args) {
	A basic1=new A();
	basic1.print();
	}

}
