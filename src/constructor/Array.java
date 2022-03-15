package constructor;
import java.util.Scanner;
class Stringlist
{
	private String S[];
	Stringlist()
	{
		S=new String[3];
	}
	void read()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Input strings");
		for(int i=0;i<=S.length;i++)
			S[i]=scan.next();
	}
	void print()
	{
	System.out.println("Strings are");
	for(String str:S)
	System.out.println(str);
	}
}
public class Array {

	public static void main(String[] args)
	{
		Stringlist str1=new Stringlist();
		Stringlist str2=new Stringlist();
		str1.read();
		str1.print();
		str2.read();
		str2.print();

	}

}
