package OOPS;
class Employe
{
	private int empno;
	private String name;
	private float salary;
	void setAccount(int empno,String name)
	{
		this.empno=empno;
		this.name=name;
	}
	void setAccount(int empno,String name,float salary)
	{
		//this.empno=empno;
		//this.name=name;
		setAccount(empno,name);
		this.salary=salary;
	}
	void printAccount()
	{
		System.out.println(empno);
		System.out.println(name);
		System.out.println(salary);
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		Employe emp1=new Employe();
		emp1.setAccount(1,"shiva");
		emp1.printAccount();
		Employe emp2=new Employe();
		emp2.setAccount(2,"rakesh",1000f);
		emp2.printAccount();

	}

}
