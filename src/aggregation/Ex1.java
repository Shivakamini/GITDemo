package aggregation;
class Marks
{
	private int sub1;
	private int sub2;
	void setdetails(int sub1,int sub2)
	{
		this.sub1=sub1;
		this.sub2=sub2;
	}
	void printdetails(Student S)
	{
	System.out.println(S.getrno());
	System.out.println(S.getname());
	if(sub1<=40&&sub2<=40)
	System.out.println("pass");	
	else
	System.out.println("fail");			
	}
}
class Student
{
	private int rno;
	private String name;
	void setStudent(int rno,String name)
	{
	this.rno=rno;
	this.name=name;
	}
	int getrno()
	{
		return rno;
	}
	String getname()
	{
		return name;
	}
}
public class Ex1 {

	public static void main(String[] args) {
		Student Stud=new Student();
		Stud.setStudent(1,"Shiva");
		Marks Mark=new Marks();
		Mark.setdetails(10,50);
		Mark.printdetails(Stud);

	}

}
