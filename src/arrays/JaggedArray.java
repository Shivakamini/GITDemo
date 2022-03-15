package arrays;
import java.util.Scanner;
public class JaggedArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("How many matches");
		int m=s.nextInt();
		int p[][]=new int[m][];
		int i,j;
		for(i=0;i<m;i++)
		{
		System.out.println("how many players");
		int N=s.nextInt();
		p[i]=new int[N];
		}
		System.out.println("How much is score");
		for(i=0;i<m;i++)
	    for(j=0;j<p[i].length;j++)
        p[i][j]=s.nextInt();
		System.out.println("scores are");
		{
		for(int x[]:p)
		{
		for (int e:x)	
			System.out.println(e);
		}
		}
	}

}
