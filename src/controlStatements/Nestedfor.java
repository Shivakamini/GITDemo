package controlStatements;

public class Nestedfor {

	public static void main(String[] args) {
		loop1:
		for(int i=1;i<=5;i++)
		{
			loop2:
			for(int j=1;j<=5;j++)
			{
				if(j<=i)
					System.out.println(j);
				else
					continue loop1;
			}
	
					System.out.println();
		}

	}

}
