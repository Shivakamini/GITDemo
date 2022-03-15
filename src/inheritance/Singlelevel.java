package inheritance;
class student
{
	private int rno;
	private String name;
	void input(int rno,String name)
	{
		this.rno=rno;
		this.name=name;
	}
	void output()
	{
		System.out.println(rno);
		System.out.println(name);
	}
}
class Employee extends student
{
	private float salary;
		void inp(float salary)
		{
			this.salary=salary;
		}
		void out()
		{
			System.out.println(salary);
	}
}
public class Singlelevel {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.inp(100f);
		emp.out();
		emp.input(1,"Shiva");
		emp.output();

	}

}
