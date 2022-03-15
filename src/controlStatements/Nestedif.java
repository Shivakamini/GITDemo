package controlStatements;
import java.util.Scanner;
public class Nestedif {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter 3 numbers");
		int x=s.nextInt();
		int y=s.nextInt();
		int z=s.nextInt();
		if(x>y)
		{
			if(x>z)
			{
				System.out.println(x);
			}
			else
			{
				System.out.println(z);
			}
		}
			else
			{
				if(y>z){
				System.out.println(y);
				}
				else
				{
					System.out.println(z);
				}
			}
		}
	}
