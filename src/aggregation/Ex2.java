package aggregation;
class student1
{
	private int sub1;
	private int sub2;
	void setdetails(int sub1,int sub2)
	{
		this.sub1=sub1;
		this.sub2=sub2;
	}
	void print()
	{
		System.out.println(sub1);
		System.out.println(sub2);
	}
	boolean comparemarks(student1 s)
	{
		if(sub1==s.sub1&&sub2==s.sub2)
			return true;
		else 
			return false;	
	}
}
public class Ex2 {

	public static void main(String[] args) {
student1 stud1=new student1();
student1 stud2=new student1();
stud1.setdetails(10,20);
stud2.setdetails(30,40);
boolean b=stud1.comparemarks(stud2);
if(b==true)
{
System.out.println("equal");
}
else
{
	System.out.println("Unequal");
	}
	}
}
