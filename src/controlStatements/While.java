package controlStatements;
import java.util.Scanner;
public class While {

	public static void main(String[] args) {
		//int i=1;
				//while(i>=10)
					//System.out.println(i);
					//i=i+1;
					//System.out.println("NIT");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter num");
		int n=s.nextInt();
		while(true)
		{
			if(n>1)
			break;
			System.out.println(n);
		}
		System.out.println("NIT");

	}

}
