package arrays;
import java.util.Scanner;
public class OneDimensional {

	public static void main(String[] args) {
		//int a[]=new int[3];
		Scanner s=new Scanner(System.in);
		System.out.println("Array size");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("input array elements");
		for(int i=0;i<a.length;i++)
		a[i]=s.nextInt();
		System.out.println(a);
		System.out.println(a.length);
		//System.out.println("Array element");
		//for(int i=0;i<a.length;i++)
		//System.out.println(a[i]);
		//for reading elements
		for(int e:a)
		{
		System.out.println(e);
		}
		//for getting sum
		//int sum=0;
			//for(int e:a)
				//sum=sum+e;
		//System.out.println("sum is"+sum);
		

	}

}
