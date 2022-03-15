package controlStatements;

import java.util.Scanner;

public class Maxof2numbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("input 2 numbers");
		int x=s.nextInt();
		int y=s.nextInt();
		if(x>y)
		{
			System.out.println("max is:" +x);
		}
		else
		{
			System.out.println("max is:" +y);
		}
		
		

	}

}
