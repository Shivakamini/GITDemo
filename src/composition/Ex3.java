package composition;

import java.util.Scanner;

class Address
{
	private String street;
	private String city;
	void input()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("input street");
		street=s.next();
		System.out.println("input city");
		city=s.next();
	}
	void output()
	{
		System.out.println(street);
		System.out.println(city);
	}
}
class Person
{
	private String name;
	Address adr=new Address();
	void input()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("input name");
	name=s.next();
	}
	void output()
	{
		System.out.println(name);
	}
}
public class Ex3 {

	public static void main(String[] args) {
		Person per=new Person();
		per.input();
		per.output();
		per.adr.input();
		per.adr.output();
	}

}
