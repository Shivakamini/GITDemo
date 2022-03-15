package controlStatements;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//System.out.println("input any number");
		//int n=scan.nextInt();
		//int n=10;
		//if(n==10)
		//{
		//	System.out.println("shiva");
		//}
		System.out.println("Input any char");
		char ch=scan.next().charAt(0);
		/*if(ch=='a'||ch=='e')
	        System.out.println("Vowel");
	        System.out.println("Other");*/
		if(ch=='a'||ch=='e')
		{
		System.out.println("Vowel");
		}
		else
		{
		System.out.println("Other");
		}
		//System.out.println("NoMatch");
	}

}
