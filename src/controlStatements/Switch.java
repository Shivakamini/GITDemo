package controlStatements;
import  java.util.Scanner;

public class Switch {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter num");
		int x=s.nextInt();
		switch(x)
		{
		case 3:
		System.out.println(3);
		break;
		case 6:
			System.out.println("NAN");
			break;
		default:
		System.out.println("Other");
		}
	}

}
