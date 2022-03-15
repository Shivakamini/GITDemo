package constructor;
class Emp
{
	private int empno;
	private String name;
	static float salary;
	Emp(int e,String n)
	{
		empno=e;
		name=n;
	}
	//Emp(int e,String n,float s)
	//{
		//empno=e;
		//name=n;
		//this(e,n); //constructor call
		//salary=s;
	//}
	//void sal(float s)
	//{
	//	salary=s;
	//}
	void print()
	{
		System.out.println(empno);
		System.out.println(name);
		System.out.println(salary);
	}
}
public class PrintEmpDetails {

	public static void main(String[] args) {
		Emp emp1=new Emp(1,"Shiva");
		Emp emp2=new Emp(2,"rakesh");
		Emp.salary=100f;
		emp1.print();
		emp2.print();
		

	}

}
