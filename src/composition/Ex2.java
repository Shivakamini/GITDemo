package composition;
class A
{
	int x=10;
}
class B
{
	A obj1=new A();
	int y=20;
}
class C
{
	B obj2=new B();
	int z=30;
}
public class Ex2 {

	public static void main(String[] args) {
	C obj3=new C();
	System.out.println(obj3.z);
	System.out.println(obj3.obj2.y);
	System.out.println(obj3.obj2.obj1.x);

	}

}
