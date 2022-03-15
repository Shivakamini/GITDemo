package controlStatements;
import java.util.Scanner;

public class Ifelseif {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Input 3 integers");
		int n1=s.nextInt();
		int n2=s.nextInt();
		int n3=s.nextInt();
	    if(n1>n2 && n1>n3)
	    {
	    	System.out.println("max is" +n1);
	    }
	    else
	    {
	    	if(n2>n3)
	    	{
	    		System.out.println("max is" +n2);
	    	}
	    	else
	    	{
	    		System.out.println("max is" +n3);
	    	}
	    }

	}

}
