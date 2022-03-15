package Interface;

import java.util.Scanner;

interface Driver
{
	void connect();
}
class Hp implements Driver
{
	public void connect()
	{
		System.out.println("Connect HP");
	}
}
class Sony implements Driver
{
	public void connect()
	{
		System.out.println("Connect Sony");
	}
}

public class Ex1 {

	public static void main(String[] args) throws Exception
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Input Driver");
	String name = s.next();
	Object obj = Class.forName("Ex1").newInstance();
	Driver d = (Driver)obj;
	//System.out.println(d.connect());
	
	}
	}

