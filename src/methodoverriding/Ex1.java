package methodoverriding;
import java.util.Scanner;
class shiva
{
	private String name;
	Scanner s=new Scanner(System.in);
	void read()
	{
		System.out.println("input name");
		name=s.next();
	}
	void print()
	{
		System.out.println(name);
	}
}
class person extends shiva
{
	private String course;
	
	Scanner s=new Scanner(System.in);
	void read()
	{
		super.read();
		System.out.println("input course");
		course=s.next();
	}
	void print()
	{
		super.print();
		System.out.println(course);
	}
}
public class Ex1 {

	public static void main(String[] args) {
		person p=new person();
		p.read();
		p.print();
	}

}
