package arrays;
import java.util.Scanner;
public class TwoDimensional {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("input array size");
		int size=s.nextInt();
		System.out.println("input col size");
		int column=s.nextInt();
		int a[][]=new int[size][column];
		System.out.println(a);
		System.out.println(a.length);
		System.out.println(a[0].length);
		System.out.println(a[1].length);
		System.out.println("input array elements");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			a[i][j]=s.nextInt();
		}
		//System.out.println("elements are");
		//for(int i=0;i<a.length;i++)
		//{
		//	for(int j=0;j<a.length;j++)
		//	System.out.println(a[i][j]);
		//
		//}
		for(int x[]:a)
		{
			for(int e:x)
			{
				System.out.println(e);
			}
		}

	}

}
