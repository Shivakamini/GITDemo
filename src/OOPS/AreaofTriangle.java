package OOPS;
class Triangle
{
	private int base;
	private float height;
	//void setTriangle(int b,float h)
	//{
	//	base=b;
	//	height=h;
	//}
	void setTriangle(int base,float height)
	{
		this.base=base;
		this.height=height;
	}
	void Area()
	{
		float a;
		a=0.5f*base*height;
	}
	//void setTriangle()
	{
		base=10;
		height=1.5f;
	}
	//void Area()
	{
		System.out.println(0.5f*base*height);
	}
}
public class AreaofTriangle {
	public static void main(String[] args) {
	Triangle t1=new Triangle();
	t1.setTriangle(10,1.5f);
	t1.Area();
	}

}
