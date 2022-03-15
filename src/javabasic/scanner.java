package javabasic;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter input");
		String name=scan.next();
		char[] ch=name.toCharArray();
		for(int i=0; i<name.length()-1; i++)
		{  
			for(int j=i+1;j<name.length()-1;j++)
			{
			if(ch[i]!=ch[j])
			{
				System.out.println(ch[j]);
		}

	}
		}
	}
}