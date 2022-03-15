package OOPS;
class Circle
{
	private float radius;
	void setCircle(float r)
	{
		radius=r;
	}
	float Area()
	{
		float a;
		a=3.14f*radius*radius;
		return a;
	}
}
public class Returntype {

	public static void main(String[] args) {
	Circle C=new Circle();
	C.setCircle(1.5f);
	float a=C.Area();
	System.out.println(a);
	}

}
