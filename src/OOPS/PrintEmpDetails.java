package OOPS;
class Employee
{
	private int empNo;
	private float salary;
	void setEmployee()
		{
			empNo=101;
			salary=150f;
		}
		void printEmployee()
		{
			System.out.println(empNo);
			System.out.println(salary);
		}
}
public class PrintEmpDetails {

	public static void main(String[] args) {
	Employee emp1=new Employee();
	emp1.setEmployee();
	emp1.printEmployee();
	Employee emp2=new Employee();
	emp2.setEmployee();
	emp2.printEmployee();

	}

}
