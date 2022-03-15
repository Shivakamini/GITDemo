package polymorphism;
class Manager
{
	void m1()
	{
		System.out.println("Shiva");
	}
}
class Employee extends Manager
{
	void m1()
	{
		System.out.println("rakesh");
	}
	//void m2()
	//{
	//	System.out.println("Hyma");
	//}
}
class Auditor 
{
	static void m1(Manager m)
	{
		m.m1();
	}
}
public class Runtime {

	public static void main(String[] args) {
		//Manager m;
		//m=new Employee();
		//m.m1();
		Employee e=new Employee();
		Auditor.m1(e);
	}

}
