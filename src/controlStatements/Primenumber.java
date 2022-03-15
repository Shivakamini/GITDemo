package controlStatements;

public class Primenumber {

	public static void main(String[] args) {
		
		int num=1;	
		
		while(num<=100)
		{
			int count=0;
			int i=1;
		while(i<=num)
		{
			if(num%i==0)
			{
				count=count+1;
			i=i+1;
			}
		}
		if(count==2)
		{
			System.out.println("Prime");
			num=num+1;
		}
	}
	}
}
